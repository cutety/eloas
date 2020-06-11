package com.cutety.eloas.repository;

import com.cutety.eloas.entity.NewUserTrendByDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * Description:
 * Created by cutety on 2020/5/28,20:44.
 **/
public interface NewUserTrendByDayRepository extends JpaRepository<NewUserTrendByDay,Integer>, JpaSpecificationExecutor<NewUserTrendByDay> {
    @Query(value = "SELECT n FROM NewUserTrendByDay n WHERE n.dateMonth BETWEEN :startDate AND :endDate")
    List<NewUserTrendByDay> getAllBetweenDates(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
