package com.cutety.eloas.repository;

import com.cutety.eloas.entity.FlowTrendByDay;
import com.cutety.eloas.entity.NewUserTrendByDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * Description:
 * Created by cutety on 2020/5/28,20:57.
 **/
public interface FlowTrendByDayRepository extends JpaRepository<FlowTrendByDay,Integer> {
    @Query(value = "SELECT f FROM FlowTrendByDay f WHERE f.dateMonth BETWEEN :startDate AND :endDate")
    List<FlowTrendByDay> getAllBetweenDates(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
