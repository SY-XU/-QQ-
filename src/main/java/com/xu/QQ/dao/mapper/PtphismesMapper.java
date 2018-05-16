package com.xu.QQ.dao.mapper;

import com.xu.QQ.domain.Ptphismes;
import com.xu.QQ.domain.PtphismesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PtphismesMapper {
    long countByExample(PtphismesExample example);

    int deleteByExample(PtphismesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ptphismes record);

    int insertSelective(Ptphismes record);

    List<Ptphismes> selectByExampleWithBLOBs(PtphismesExample example);

    List<Ptphismes> selectByExample(PtphismesExample example);

    Ptphismes selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ptphismes record, @Param("example") PtphismesExample example);

    int updateByExampleWithBLOBs(@Param("record") Ptphismes record, @Param("example") PtphismesExample example);

    int updateByExample(@Param("record") Ptphismes record, @Param("example") PtphismesExample example);

    int updateByPrimaryKeySelective(Ptphismes record);

    int updateByPrimaryKeyWithBLOBs(Ptphismes record);

    int updateByPrimaryKey(Ptphismes record);
}