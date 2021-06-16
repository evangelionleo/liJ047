package cn.edu.ujn.lij047.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.ujn.lij047.dao.Office;
import cn.edu.ujn.lij047.service.IOfficeService;



@RestController
@RequestMapping(value = "/Office")
public class OfficeController {
	@Autowired
	private IOfficeService officeservice;
	// 注入ICustomerService
	@Autowired


	@RequestMapping(value = "/OfficeList")
	public List<Office> findAllCustomerSource() {
		List<Office> list = officeservice.findAllOffice();
		return list;
	}
	@RequestMapping(value = "/getOfficeById")
	public Office getOfficeById(int id) {
		return officeservice.getOfficeById(id);
	}
	@RequestMapping("/delete")
	public String deleteByPrimaryKey(Integer id) {
		Integer a = officeservice.deleteByPrimaryKey(id);
		if (a != null) {
			return "OK";
		} else {
			return " ";
		}
	}
	@RequestMapping("/update")
	public String updateCustomer(Office office) {

			int number = officeservice.upOfficeById(office);
			if (number > 0) {
				// 2.修改成功
				return "OK";
			} else {
				// 3.修改失败
				return "NO";
			}
		} 
}
