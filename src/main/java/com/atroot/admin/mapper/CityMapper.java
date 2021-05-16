package com.atroot.admin.mapper;

import com.atroot.admin.bean.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * Description:
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.15 21:21
 */
@Mapper
public interface CityMapper {
    @Select("select * from city where id = #{id}")
    public City getCityById(Long id);

    public void insert(City city);

//    @Insert("insert into city (name,state,country) values (#{name},#{state},#{country})")
//    @Options(useGeneratedKeys = true,keyProperty = "id")
//    public void insert(City city);
}
