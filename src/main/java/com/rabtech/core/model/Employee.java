package com.rabtech.core.model;
public abstract class Employee {
    private final String id;
    private String name;
    private double salary;
    public Employee(String id, String name, double salary){ this.id=id; this.name=name; this.salary=salary; }
    public String getId(){ return id; }
    public String getName(){ return name; }
    public double getSalary(){ return salary; }
    public void setSalary(double salary){ this.salary=salary; }
    public abstract double calculateBonus();
}
