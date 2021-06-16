package cn.edu.ujn.lij047.dao;

import java.util.List;

import cn.edu.ujn.lij047.dao.Office;

public interface OfficeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Office record);

    int insertSelective(Office record);

    Office selectByPrimaryKey(Integer custId);

    int updateByPrimaryKeySelective(Office record);

    int updateByPrimaryKey(Office record);
    
    List<Office> selectAll();
}