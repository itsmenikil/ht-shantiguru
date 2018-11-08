package com.hawkertracker.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.hawkertracker.constants.ApplicationProperty;
import com.hawkertracker.entity.Store;
import com.hawkertracker.service.intf.StoreService;
import com.hawkertracker.ui.model.StoreVO;

@RestController
@RequestMapping("/store")
public class StoreController {
	@Autowired StoreService storeServiceImpl;
	@Autowired ApplicationProperty appProp;
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public Store getPrimaryStore() {
		return new Store("Shanthi Guru", "/logo.png", "Line1", "Line2", "India", "TamilNadi", "620008","454");
	}
	
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Store createPrimaryStore(@RequestBody StoreVO store) {
		return storeServiceImpl.createPrimaryStore(store);
	}
	
	@PostMapping(path="/install",consumes= {MediaType.MULTIPART_FORM_DATA_VALUE})
	public void installStore(@RequestParam("storeJson")String storeJson ,@RequestParam("storeLogo") MultipartFile file) throws JsonParseException, JsonMappingException, IOException{
		System.out.println(StoreVO.fromJson(storeJson).toString());
		byte[] bytes = file.getBytes();
        Path path = Paths.get(appProp.APPSTOREPATH+File.separator+appProp.IMAGEPATH+File.separator+appProp.LOGOPATH+File.separator);
        boolean dirExists = Files.exists(path);
        if(!dirExists) {
        	Files.createDirectories(path);
        } 
        Files.write(path, bytes);
		System.out.println(file.getOriginalFilename());
	}
}
