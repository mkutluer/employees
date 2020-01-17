package com.mkutluer.data.entity.id;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DepartmentEmployeeId implements Serializable {

    @Column(name = "emp_no")
    private int employeeId;

    @Column(name = "dept_no", columnDefinition = "CHAR(4)", length = 4)
    private String departmentId;

    public DepartmentEmployeeId() {
    }

    public DepartmentEmployeeId(int employeeId, String departmentId) {
        this.employeeId = employeeId;
        this.departmentId = departmentId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentEmployeeId that = (DepartmentEmployeeId) o;

        if (employeeId != that.employeeId) return false;
        return departmentId.equals(that.departmentId);
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + departmentId.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "DepartmentEmployeeId{" +
                "employeeId=" + employeeId +
                ", departmentId='" + departmentId + '\'' +
                '}';
    }
}
