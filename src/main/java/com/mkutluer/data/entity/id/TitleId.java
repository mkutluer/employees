package com.mkutluer.data.entity.id;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;

@Embeddable
public class TitleId implements Serializable {

    @Column(name = "emp_no")
    private int employeeId;

    @Column(name = "title", length = 50)
    private String title;

    @Column(name = "from_date")
    private LocalDate from;

    public TitleId() {
    }

    public TitleId(int employeeId, String title, LocalDate from) {
        this.employeeId = employeeId;
        this.title = title;
        this.from = from;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

        TitleId titleId = (TitleId) o;

        if (employeeId != titleId.employeeId) return false;
        if (!title.equals(titleId.title)) return false;
        return from.equals(titleId.from);
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + title.hashCode();
        result = 31 * result + from.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "TitleId{" +
                "employeeId=" + employeeId +
                ", title='" + title + '\'' +
                ", from=" + from +
                '}';
    }
}
