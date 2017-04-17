package com.education.ssm.dao.system;

import com.education.ssm.model.system.SystemLogPo;

public interface SystemLogPoMapper {
    int deleteByPrimaryKey(String id);

    int insert(SystemLogPo record);

    int insertSelective(SystemLogPo record);

    SystemLogPo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SystemLogPo record);

    int updateByPrimaryKey(SystemLogPo record);
}