package com.hawkertracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hawkertracker.entity.Store;
import com.hawkertracker.service.intf.StoreService;
import com.hawkertracker.ui.model.StoreVO;

@RestController
@RequestMapping("/store")
public class StoreController {
	@Autowired StoreService storeServiceImpl;
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public Store getPrimaryStore() {
		return new Store("Shanthi Guru", "/logo.png", "Line1", "Line2", "India", "TamilNadi", "620008","454");
	}
	
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Store createPrimaryStore(@RequestBody StoreVO store) {
		return storeServiceImpl.createPrimaryStore(store);
	}
	
	@PostMapping(path="/install", produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Store installStore(@RequestBody StoreVO store) {
		return storeServiceImpl.createPrimaryStore(store);
	}
	

}
