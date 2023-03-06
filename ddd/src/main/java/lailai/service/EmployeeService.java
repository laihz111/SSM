package lailai.service;


import com.github.pagehelper.PageInfo;
import lailai.pojo.Employee;

public interface EmployeeService {

    PageInfo<Employee> getEmployeeList(Integer pageNum);
}
