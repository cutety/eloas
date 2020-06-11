package com.cutety.eloas.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.sql.Date;

@Entity
@Data
public class BehaviorConversion {
    private BigInteger buySum;
    private String buyLastConversionRate;
    private String buyTotalConversionRate;
    private BigInteger cartFavSum;
    private String cartFavLastConversionRate;
    private String cartFavTotalConversionRate;
    private BigInteger pvSum;
    private String pvLastConversionRate;
    private String pvTotalConversionRate;
    @Id
    private Date dateMonth;


}

