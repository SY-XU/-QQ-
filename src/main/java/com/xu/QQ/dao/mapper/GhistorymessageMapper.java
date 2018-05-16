package com.xu.QQ.dao.mapper;

import com.xu.QQ.domain.Ghistorymessage;
import com.xu.QQ.domain.GhistorymessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GhistorymessageMapper {
    long countByExample(GhistorymessageExample example);

    int deleteByExample(GhistorymessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ghistorymessage record);

    int insertSelective(Ghistorymessage record);

    List<Ghistorymessage> selectByExampleWithBLOBs(GhistorymessageExample example);

    List<Ghistorymessage> selectByExample(GhistorymessageExample example);

    Ghistorymessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ghistorymessage record, @Param("example") GhistorymessageExample example);

    int updateByExampleWithBLOBs(@Param("record") Ghistorymessage record, @Param("example") GhistorymessageExample example);

    int updateByExample(@Param("record") Ghistorymessage record, @Param("example") GhistorymessageExample example);

    int updateByPrimaryKeySelective(Ghistorymessage record);

    int updateByPrimaryKeyWithBLOBs(Ghistorymessage record);

    int updateByPrimaryKey(Ghistorymessage record);
}