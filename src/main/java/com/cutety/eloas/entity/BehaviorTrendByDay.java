package com.cutety.eloas.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
@Entity
@Data
public class BehaviorTrendByDay {
    private Integer pv;
    private Integer cart;
    private Integer fav;
    private Integer buy;
    @Id
    private Date dateMonth;
}
