package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.City;
import com.example.service.cityService;

@RestController
public class cityController {
	
	@Autowired
	private cityService cityService;
	
	public static void a () {
		System.out.println("controller aaaaaaaaaaaaaaaaaaaaaaaaaa");
	}
	
	@RequestMapping(value="/syz/city",method=RequestMethod.GET)
	public City citySelectById(@RequestParam(value="id",required=true)int id) {
		System.out.println("cityController");
		return cityService.selectCity(id);
	}
	
	@RequestMapping(value="/api/name",method=RequestMethod.GET)
	public String updateById(@RequestParam(value="id")int id,@RequestParam(value="cityName")String cityName) {
		return cityService.UpdateCityName(id, cityName);		
	}
}