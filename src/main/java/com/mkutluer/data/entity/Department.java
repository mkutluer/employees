package com.mkutluer.data.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments", indexes = {@Index(name = "dept_name", columnList = "dept_name", unique = true)})
public class Department {

    @Id
    @Column(name = "dept_no", columnDefinition = "CHAR(4)", length = 4)
    private String no;

    @Column(name = "dept_name", length = 40, nullable = false)
    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<DepartmentEmployee> departmentEmployees = new ArrayList<>();

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<DepartmentManager> departmentManagers = new ArrayList<>();

    public Department() {
    }

    public Department(String no, String name) {
        this.no = no;
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DepartmentEmployee> getDepartmentEmployees() {
        return departmentEmployees;
    }

    public void setDepartmentEmployees(List<DepartmentEmployee> departmentEmployees) {
        this.departmentEmployees = departmentEmployees;
    }

    public List<DepartmentManager> getDepartmentManagers() {
        return departmentManagers;
    }

    public void setDepartmentManagers(List<DepartmentManager> departmentManagers) {
        this.departmentManagers = departmentManagers;
    }

    @Override
    public String toString() {
        return "Department{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
