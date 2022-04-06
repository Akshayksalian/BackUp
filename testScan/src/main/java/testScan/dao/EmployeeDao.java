package testScan.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import testScan.dto.Employee;

@Repository
public class EmployeeDao {
	
	public Employee getEmployeeById(int empId) {
		List<Employee> empList = getEmployeeList();
		
		for(Employee x : empList) {
			if(x.getEmptId()==empId) {
				return x;
			}
		}
		
		return null;
	}

	private List<Employee> getEmployeeList() {
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp = new Employee(1,"Akshay","IT");
		empList.add(emp);
		emp = new Employee(2,"Bharath","HR");
		empList.add(emp);
		emp = new Employee(3,"Chandan","Manager");
		empList.add(emp);
		return empList;
	}

}
