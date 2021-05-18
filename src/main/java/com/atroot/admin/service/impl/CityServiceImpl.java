package com.atroot.admin.service.impl;

import com.atroot.admin.bean.City;
import com.atroot.admin.mapper.CityMapper;
import com.atroot.admin.service.CityService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.15 21:25
 */

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityMapper cityMapper;

    Counter counter;

    public CityServiceImpl(MeterRegistry meterRegistry) {
        counter = meterRegistry.counter("cityService.insert.count");

    }

    public City getCityById(Long id) {
        return cityMapper.getCityById(id);
    }

    public City insert(City city) {
        cityMapper.insert(city);
        counter.increment();
        return city;
    }
}
