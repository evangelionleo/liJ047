package cn.edu.ujn.lij047.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.ujn.lij047.dao.Office;
import cn.edu.ujn.lij047.dao.OfficeMapper;
import cn.edu.ujn.lij047.service.IOfficeService;
@Service("OfficeService")
@Transactional
public class OfficeServiceImpl implements IOfficeService{
	@Autowired
	private OfficeMapper officeMapper;
	@Override
	public List<Office> findAllOffice() {
		// TODO Auto-generated method stub
		List<Office> list =officeMapper.selectAll();
		return list;
	}

	@Override
	public int CreatenewOffice(Office record) {
		// TODO Auto-generated method stub
		int insert = officeMapper.insert(record);
		return insert;
	}

	@Override
	public Integer deleteByPrimaryKey(Integer custId) {
		// TODO Auto-generated method stub
		int in=officeMapper.deleteByPrimaryKey(custId);
		return in;
	}

	@Override
	public Office getOfficeById(Integer custId) {
		// TODO Auto-generated method stub
		
		return officeMapper.selectByPrimaryKey(custId);
	}

	@Override
	public int upOfficeById(Office record) {
		// TODO Auto-generated method stub
		
		return officeMapper.updateByPrimaryKeySelective(record);
	}

}
