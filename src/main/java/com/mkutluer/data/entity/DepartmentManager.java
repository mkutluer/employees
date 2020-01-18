package com.mkutluer.data.entity;

import com.mkutluer.data.entity.id.DepartmentManagerId;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "dept_manager", indexes = {@Index(name = "emp_no", columnList = "emp_no")})
public class DepartmentManager {

    @EmbeddedId
    private DepartmentManagerId id;

    @Column(name = "from_date", nullable = false)
    private LocalDate from;

    @Column(name = "to_date", nullable = false)
    private LocalDate to;

    @ManyToOne
    @MapsId("employeeId")
    @JoinColumn(name = "emp_no", foreignKey = @ForeignKey(name = "dept_manager_ibfk_1"))
    private Employee employee;

    @ManyToOne
    @MapsId("departmentId")
    @JoinColumn(name = "dept_no", foreignKey = @ForeignKey(name = "dept_manager_ibfk_2"))
    private Department department;

    public DepartmentManager() {
    }

    public DepartmentManager(DepartmentManagerId id, LocalDate from, LocalDate to) {
        this.id = id;
        this.from = from;
        this.to = to;
    }

    public DepartmentManagerId getId() {
        return id;
    }

    public void setId(DepartmentManagerId id) {
        this.id = id;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "DepartmentManager{" +
                "id=" + id +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
