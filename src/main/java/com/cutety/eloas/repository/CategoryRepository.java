package com.cutety.eloas.repository;

import com.cutety.eloas.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Integer>, JpaSpecificationExecutor<Category> {
    @Query(nativeQuery = true,value="SELECT * from category_buy_top where date_month =?")
    List<Category> findBuyTop(String date);

    @Query(nativeQuery = true,value="SELECT * from category_cart_top where date_month =?")
    List<Category> findCartTop(String date);
    @Query(nativeQuery = true,value="SELECT * from category_fav_top where date_month =?")
    List<Category> findFavTop(String date);
    @Query(nativeQuery = true,value="SELECT * from category_pv_top where date_month =?")
    List<Category> findPvTop(String date);

}
