package com.mkutluer.data.entity.id;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DepartmentManagerId extends DepartmentEmployeeId {
    @Column(name = "emp_no")
    private int employeeId;

    @Column(name = "dept_no", columnDefinition = "CHAR(4)", length = 4)
    private String departmentId;
}
