package cn.edu.ujn.lij047.service;

import java.util.List;

import cn.edu.ujn.lij047.dao.Office;

public interface IOfficeService {
		public List<Office> findAllOffice();
		public int CreatenewOffice(Office  record);
	 	public Integer deleteByPrimaryKey(Integer custId);

	  	public Office getOfficeById(Integer custId);

	  	public int upOfficeById(Office  record);
}
