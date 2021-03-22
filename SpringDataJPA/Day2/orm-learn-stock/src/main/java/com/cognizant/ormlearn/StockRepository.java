package com.cognizant.ormlearn;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

	@Query("SELECT s FROM Stock s WHERE s.code='FB' and s.date between :startDate and :endDate")
	List<Stock> findAllByDateBetween(Date startDate, Date endDate);
	
	@Query("SELECT s FROM Stock s WHERE s.code='GOOGL' and s.stockClose > :price")
	List<Stock> findAllByPriceGreaterThan(BigDecimal price);
	
//	@Query("SELECT s FROM Stock s ORDER BY s.volume LIMIT :limit")
	List<Stock> findTop3ByOrderByVolumeDesc();

//	@Query("SELECT s FROM Stock s where s.code= :code")
	List<Stock> findTop3ByCodeOrderByStockCloseAsc(@Param("code") String code);
}
