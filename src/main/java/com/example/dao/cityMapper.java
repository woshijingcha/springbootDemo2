package com.example.dao;




import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.domain.City;
import com.example.domain.cityExample;

public interface cityMapper {
    int countByExample(cityExample example);

    int deleteByExample(cityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(cityExample example);

    City selectByPrimaryKey(@Param("id") Integer id);

    int updateByExampleSelective(@Param("record") City record, @Param("example") cityExample example);

    int updateByExample(@Param("record") City record, @Param("example") cityExample example);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(@Param("record")City record);
}