package com.education.ssm.dao.system;

import com.education.ssm.model.system.SystemIdcardPo;

public interface SystemIdcardPoMapper {
    int deleteByPrimaryKey(String id);

    int insert(SystemIdcardPo record);

    int insertSelective(SystemIdcardPo record);

    SystemIdcardPo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SystemIdcardPo record);

    int updateByPrimaryKey(SystemIdcardPo record);
}