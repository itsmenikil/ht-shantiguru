package com.hawkertracker.service.intf;

import com.hawkertracker.entity.Store;
import com.hawkertracker.ui.model.StoreVO;


public interface StoreService {
	
	Store createPrimaryStore(StoreVO storeVo);

}
