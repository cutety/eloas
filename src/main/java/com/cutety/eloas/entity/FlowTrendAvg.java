package com.cutety.eloas.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Entity
public class FlowTrendAvg  {

    private Double avgPv;
    private Double avgUv;
    @Id
    private String dateTime;

    public FlowTrendAvg() {
    }

    public FlowTrendAvg(Double avgPv, Double avgUv, String dateTime) {
        this.avgPv = avgPv;
        this.avgUv = avgUv;
        this.dateTime = dateTime;
    }
}
