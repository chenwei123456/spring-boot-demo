package com.hbu.dao;

import com.hbu.domain.SysUser;

/**
 * Created by chenwei on 2018/2/5.
 */
public interface UserDao {

    public SysUser findByUserName(String username);


}
