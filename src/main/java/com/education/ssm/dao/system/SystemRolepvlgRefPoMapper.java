package com.education.ssm.dao.system;

import com.education.ssm.model.system.SystemRolepvlgRefPoKey;

public interface SystemRolepvlgRefPoMapper {
    int deleteByPrimaryKey(SystemRolepvlgRefPoKey key);

    int insert(SystemRolepvlgRefPoKey record);

    int insertSelective(SystemRolepvlgRefPoKey record);
}