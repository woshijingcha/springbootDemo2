package com.example.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.cityMapper;
import com.example.domain.City;
import com.example.service.cityService;

@Service
public class cityServiceImpl implements cityService {

	@Autowired
	cityMapper cityMapper;

	
	@Override
	public City selectCity(int id) {
		// TODO Auto-generated method stub
		System.out.println("selectCity");
		return cityMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public String UpdateCityName(int id, String cityName) {
		// TODO Auto-generated method stub
		try {
			City record = cityMapper.selectByPrimaryKey(id);
			record.setCityName(cityName);
			cityMapper.updateByPrimaryKeySelective(record);
			return "chenggong成功";
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getLocalizedMessage());
			return "shibai失败";
		}
	}

}
