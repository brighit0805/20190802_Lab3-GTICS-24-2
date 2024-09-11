package com.example.lab3_20190803.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.time.Instant;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class JobHistoryId implements java.io.Serializable {
    private static final long serialVersionUID = -139356372930039426L;
    @Column(name = "job_history_id", nullable = false)
    private Integer jobHistoryId;

    @Column(name = "employee_id", nullable = false)
    private Integer employeeId;

    @Column(name = "start_date", nullable = false)
    private Instant startDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        JobHistoryId entity = (JobHistoryId) o;
        return Objects.equals(this.jobHistoryId, entity.jobHistoryId) &&
                Objects.equals(this.employeeId, entity.employeeId) &&
                Objects.equals(this.startDate, entity.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobHistoryId, employeeId, startDate);
    }

}