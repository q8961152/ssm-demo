package com.education.ssm.dao.system;

import com.education.ssm.model.system.SystemDepartmentPo;

public interface SystemDepartmentPoMapper {
    int deleteByPrimaryKey(String id);

    int insert(SystemDepartmentPo record);

    int insertSelective(SystemDepartmentPo record);

    SystemDepartmentPo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SystemDepartmentPo record);

    int updateByPrimaryKey(SystemDepartmentPo record);
}