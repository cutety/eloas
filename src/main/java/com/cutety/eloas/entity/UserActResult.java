package com.cutety.eloas.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Data
@Entity
public class UserActResult {
    @Id
    private Date dateMonth;
    private Integer dau;
    private  Integer wau;
    private Integer mau;
    private Double dauDivMau;

    public UserActResult() {
    }

    public UserActResult(Date dateMonth, Integer dau, Integer wau, Integer mau, Double dauDivMau) {
        this.dateMonth = dateMonth;
        this.dau = dau;
        this.wau = wau;
        this.mau = mau;
        this.dauDivMau = dauDivMau;
    }
}
