package com.hbu.dao;

import com.hbu.domain.Permission;

import java.util.List;

/**
 * Created by chenwei on 2018/2/5.
 */
public interface PermissionDao {
    public List<Permission>findAll();
    public List<Permission>findByAdminUserId(int userId);
}
