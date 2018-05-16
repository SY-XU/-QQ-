package com.xu.QQ.dao.mapper;

import com.xu.QQ.domain.Usergroup;
import com.xu.QQ.domain.UsergroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsergroupMapper {
    long countByExample(UsergroupExample example);

    int deleteByExample(UsergroupExample example);

    int deleteByPrimaryKey(Integer usergroupid);

    int insert(Usergroup record);

    int insertSelective(Usergroup record);

    List<Usergroup> selectByExample(UsergroupExample example);

    Usergroup selectByPrimaryKey(Integer usergroupid);

    int updateByExampleSelective(@Param("record") Usergroup record, @Param("example") UsergroupExample example);

    int updateByExample(@Param("record") Usergroup record, @Param("example") UsergroupExample example);

    int updateByPrimaryKeySelective(Usergroup record);

    int updateByPrimaryKey(Usergroup record);
}