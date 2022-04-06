package testScan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testScan.dao.EmployeeDao;
import testScan.dto.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao empDao;
	
	public Employee getEmployeeById(int empId) {
		
		return empDao.getEmployeeById(empId);
	}

}
