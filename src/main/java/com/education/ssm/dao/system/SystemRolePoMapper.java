package com.education.ssm.dao.system;

import com.education.ssm.model.system.SystemRolePo;

public interface SystemRolePoMapper {
    int deleteByPrimaryKey(String id);

    int insert(SystemRolePo record);

    int insertSelective(SystemRolePo record);

    SystemRolePo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SystemRolePo record);

    int updateByPrimaryKey(SystemRolePo record);
}