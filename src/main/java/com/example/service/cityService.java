package com.example.service;

import com.example.domain.City;

public interface cityService {

	public City selectCity(int id);
	public String UpdateCityName(int id , String cityName);
	
}
