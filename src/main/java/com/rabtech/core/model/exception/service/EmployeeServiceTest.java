package com.rabtech.core.service;
import com.rabtech.core.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class EmployeeServiceTest {
    @Test public void testAddAndSort(){
        EmployeeManagementService service = new EmployeeManagementService();
        service.addEmployee(new FullTimeEmployee("1","Kajal",50000));
        service.addEmployee(new ContractEmployee("2","Rahul",30000));
        assertEquals(2, service.getAll().size());
        assertEquals(30000, service.sortBySalary().get(0).getSalary());
    }
    @Test public void testFilter(){
        EmployeeManagementService service = new EmployeeManagementService();
        service.addEmployee(new FullTimeEmployee("1","Kajal",50000));
        assertEquals(1, service.filterHighEarners(40000).size());
    }
}
