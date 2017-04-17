package com.education.ssm.dao.system;

import com.education.ssm.model.system.SystemPrivilegePo;

public interface SystemPrivilegePoMapper {
    int deleteByPrimaryKey(String id);

    int insert(SystemPrivilegePo record);

    int insertSelective(SystemPrivilegePo record);

    SystemPrivilegePo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SystemPrivilegePo record);

    int updateByPrimaryKey(SystemPrivilegePo record);
}