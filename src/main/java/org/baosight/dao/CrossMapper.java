package org.baosight.dao;

import java.util.List;

import org.baosight.model.Cross;

public interface CrossMapper {
    int deleteByPrimaryKey(Integer crossid);

    int insert(Cross record);

    int insertSelective(Cross record);

    Cross selectByPrimaryKey(Integer crossid);

    int updateByPrimaryKeySelective(Cross record);

    int updateByPrimaryKey(Cross record);
    
    List<Cross> getAll();
 }