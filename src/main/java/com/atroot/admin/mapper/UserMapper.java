package com.atroot.admin.mapper;

import com.atroot.admin.bean.User;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Description:
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.16 11:02
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
