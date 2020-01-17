package com.mkutluer.data.entity;

import com.mkutluer.data.entity.id.TitleId;

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
@Table(name = "titles")
public class Title {

    @EmbeddedId
    private TitleId id;

    @Column(name = "to_date")
    private LocalDate to;

    @ManyToOne
    @MapsId("employeeId")
    @JoinColumn(name = "emp_no", foreignKey = @ForeignKey(name = "titles_ibfk_1"))
    private Employee employee;

    public Title() {
    }

    public Title(TitleId id) {
        this.id = id;
    }

    public TitleId getId() {
        return id;
    }

    public void setId(TitleId id) {
        this.id = id;
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
        return "Title{" +
                "id=" + id +
                ", to=" + to +
                '}';
    }
}
