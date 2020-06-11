package com.cutety.eloas.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
public class Commodity {
    @Id
    private Integer id;
    private String itemId;
    private Date dateMonth;
    private Integer pv;
    private Integer cart;
    private Integer fav;
    private Integer buy;
}
