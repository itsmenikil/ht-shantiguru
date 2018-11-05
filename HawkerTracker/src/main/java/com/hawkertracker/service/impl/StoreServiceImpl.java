package com.hawkertracker.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hawkertracker.entity.Store;
import com.hawkertracker.repository.StoreRepository;
import com.hawkertracker.service.intf.StoreService;
import com.hawkertracker.ui.model.StoreVO;

@Service
public class StoreServiceImpl implements StoreService {
	
	@Autowired StoreRepository storeRepo;

	@Override
	@Transactional
	public Store createPrimaryStore(StoreVO storeVo) {
		Store store =new Store(storeVo.getStoreName(), "testPath", storeVo.getAddressLine1(), 
				storeVo.getAddressLine2(), storeVo.getCountry(), storeVo.getState(), storeVo.getPincode(),storeVo.getStoreContact());
		Store persistedStore=storeRepo.save(store);
		return persistedStore;
	}

}
