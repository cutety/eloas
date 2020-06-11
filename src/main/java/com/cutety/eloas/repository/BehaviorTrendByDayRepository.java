package com.cutety.eloas.repository;

import com.cutety.eloas.entity.BehaviorTrendByDay;
import com.cutety.eloas.entity.FlowTrendByDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface BehaviorTrendByDayRepository extends JpaRepository<BehaviorTrendByDay, Date> {
    @Query(value = "SELECT f FROM BehaviorTrendByDay f WHERE f.dateMonth BETWEEN :startDate AND :endDate")
    List<BehaviorTrendByDay> getAllBetweenDates(@Param("startDate") java.util.Date startDate, @Param("endDate") java.util.Date endDate);
}
