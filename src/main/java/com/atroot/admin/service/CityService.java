package com.atroot.admin.service;

import com.atroot.admin.bean.City;
import com.atroot.admin.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.15 21:25
 */

@Service
public class CityService {

    @Autowired
    CityMapper cityMapper;
    public City getCityById(Long id){
        return cityMapper.getCityById(id);
    }

    public City insert(City city){
        cityMapper.insert(city);
        return city;
    }
}
