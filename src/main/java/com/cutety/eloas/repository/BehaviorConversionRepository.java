package com.cutety.eloas.repository;

import com.cutety.eloas.entity.BehaviorConversion;
import com.cutety.eloas.entity.BehaviorResult;
import org.hibernate.mapping.Value;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;


public interface BehaviorConversionRepository extends JpaRepository<BehaviorConversion, Date>, JpaSpecificationExecutor<BehaviorConversion> {

    @Query(nativeQuery = true,value="SELECT buy_sum,CONCAT(ROUND(buy_sum / cart_fav_sum * 100, 2), '%') AS buy_last_conversion_rate,CONCAT(ROUND(buy_sum / pv_sum * 100, 2), '%') AS buy_total_conversion_rate,cart_fav_sum,CONCAT(ROUND(cart_fav_sum / pv_sum * 100, 2), '%') AS cart_fav_last_conversion_rate,CONCAT(ROUND(cart_fav_sum / pv_sum * 100, 2), '%') AS cart_fav_total_conversion_rate,pv_sum,CONCAT(ROUND(pv_sum / pv_sum * 100, 2), '%') AS pv_last_conversion_rate,CONCAT(ROUND(pv_sum / pv_sum * 100, 2), '%') AS pv_total_conversion_rate FROM (SELECT SUM(buy_sum) AS buy_sum,SUM(cart_fav_sum) AS cart_fav_sum,SUM(pv_sum) AS pv_sum  FROM (SELECT *  FROM behavior_conversion WHERE date_month BETWEEN ?1 AND ?2) as tmp) t2")
    List<BehaviorResult> findByDate(String sdate, String edate);
}
