package com.mkutluer.data.entity;

import com.mkutluer.data.entity.id.SalaryId;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "salaries")
public class Salary {

    @EmbeddedId
    private SalaryId id;

    @Column(name = "salary", nullable = false)
    private int salary;

    @Column(name = "to_date", nullable = false)
    private LocalDate to;

    @ManyToOne
    @MapsId("employeeId")
    @JoinColumn(name = "emp_no", foreignKey = @ForeignKey(name = "salaries_ibfk_1"))
    private Employee employee;

    public Salary() {
    }

    public Salary(SalaryId id, int salary, LocalDate to) {
        this.id = id;
        this.salary = salary;
        this.to = to;
    }

    public SalaryId getId() {
        return id;
    }

    public void setId(SalaryId id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", salary=" + salary +
                ", to=" + to +
                '}';
    }
}
