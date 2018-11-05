package com.hawkertracker.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hawkertracker.entity.Store;

@RestController
@RequestMapping("/store")
public class StoreController {
	
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public Store getPrimaryStore() {
		return new Store(1L, "Shanthi Guru", "/logo.png", "Line1", "Line2", "India", "TamilNadi", "620008");
	}
	

}
