package com.study.array.service;

import com.study.array.entity.DataObj;
import com.study.array.repository.DataRepository;

public class DataService {

	private static DataService instance;
	private DataRepository dataRepository;
	
	private DataService() {
		dataRepository = DataRepository.getIstance();
	}
	
	public static DataService getIstance() {
		if(instance == null) {
			instance = new DataService();		
			}
		return instance;
	}
	
	public int addData(DataObj dataObj) {
		return dataRepository.save(dataObj);
	}
}
