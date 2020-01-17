package com.mkutluer.data.entity.id;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;

@Embeddable
public class SalaryId implements Serializable {

    @Column(name = "emp_no")
    private int employeeId;

    @Column(name = "from_date")
    private LocalDate from;

    public SalaryId() {
    }

    public SalaryId(int employeeId, LocalDate from) {
        this.employeeId = employeeId;
        this.from = from;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalaryId salaryId = (SalaryId) o;

        if (employeeId != salaryId.employeeId) return false;
        return from.equals(salaryId.from);
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + from.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "SalaryId{" +
                "employeeId=" + employeeId +
                ", from=" + from +
                '}';
    }
}
