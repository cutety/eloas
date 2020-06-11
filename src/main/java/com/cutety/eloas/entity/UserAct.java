package com.cutety.eloas.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
public class UserAct {
    @Id
    private String dateMonth;
    private Integer dau;
    private Integer wau;
    private Float dw;
    private Integer mau;
    private Float dm;
}
