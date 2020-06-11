package com.cutety.eloas.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
@Data
@Entity
public class BehaviorResult {
    @Id
    private BigInteger buySum;
    private String buyLastConversionRate;
    private String buyTotalConversionRate;
    private BigInteger cartFavSum;
    private String cartFavLastConversionRate;
    private String cartFavTotalConversionRate;
    private BigInteger pvSum;
    private String pvLastConversionRate;
    private String pvTotalConversionRate;
}
