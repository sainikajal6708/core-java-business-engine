package com.rabtech.core.service;
import com.rabtech.core.exception.*;
import com.rabtech.core.model.*;
import java.util.*;
import java.util.stream.Collectors;
public class EmployeeManagementService {
    private final Map<String, Employee> employeeMap = new HashMap<>();
    public void addEmployee(Employee emp){
        if(emp.getSalary() < 0) throw new InvalidSalaryException("Salary cannot be negative");
        employeeMap.put(emp.getId(), emp);
    }
    public Employee findEmployee(String id) throws EmployeeNotFoundException {
        Employee emp = employeeMap.get(id);
        if(emp == null) throw new EmployeeNotFoundException("Employee not found: "+id);
        return emp;
    }
    public List<Employee> sortBySalary(){ return employeeMap.values().stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList()); }
    public List<Employee> filterHighEarners(double limit){ return employeeMap.values().stream().filter(e -> e.getSalary() > limit).collect(Collectors.toList()); }
    public List<Employee> getAll(){ return new ArrayList<>(employeeMap.values()); }
}
