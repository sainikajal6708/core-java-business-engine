package com.rabtech.core.model;
public class ContractEmployee extends Employee {
    public ContractEmployee(String id, String name, double salary){ super(id,name,salary); }
    @Override public double calculateBonus(){ return getSalary()*0.1; }
}
