package com.cutety.eloas.repository;

import com.cutety.eloas.entity.Category;
import com.cutety.eloas.entity.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommodityRepository extends JpaRepository<Commodity,Integer>, JpaSpecificationExecutor<Commodity> {
    @Query(nativeQuery = true,value="SELECT * from commodity_buy_top where date_month =?")
    List<Commodity> findBuyTop(String date);

    @Query(nativeQuery = true,value="SELECT * from commodity_cart_top where date_month =?")
    List<Commodity> findCartTop(String date);
    @Query(nativeQuery = true,value="SELECT * from commodity_fav_top where date_month =?")
    List<Commodity> findFavTop(String date);
    @Query(nativeQuery = true,value="SELECT * from commodity_pv_top where date_month =?")
    List<Commodity> findPvTop(String date);
}
