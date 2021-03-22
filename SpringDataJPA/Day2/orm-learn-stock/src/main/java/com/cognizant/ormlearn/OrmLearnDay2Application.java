package com.cognizant.ormlearn;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cognizant.ormlearn.model.Stock;


@SpringBootApplication
@ComponentScan("com.*")
public class OrmLearnDay2Application {

	@Autowired
	private static StockRepository stockRepository;
	
	public static void main(String[] args) throws ParseException {
		
		ApplicationContext context = SpringApplication.run(OrmLearnDay2Application.class, args);

		stockRepository = context.getBean(StockRepository.class);
		
		testFBSeptMonth();
		testGooglePrice();
		testHighestTransactions();
		testLowestStock();
	}
	
	public static void testFBSeptMonth() throws ParseException {
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date startDate = sdf.parse("2019-09-01");
		Date endDate = sdf.parse("2019-09-30");
		
		List<Stock> fbseptstock = stockRepository.findAllByDateBetween(startDate , endDate);
		
		System.out.println(fbseptstock);
		
		
	}
	
	public static void testGooglePrice() throws ParseException {
		
		
		List<Stock> googleStockPrice = stockRepository.findAllByPriceGreaterThan(new BigDecimal("1250.00"));
		
		System.out.println(googleStockPrice);
		
		
	}
	
public static void testHighestTransactions() throws ParseException {
		
		
		List<Stock> topVolume = stockRepository.findTop3ByOrderByVolumeDesc();
		
		System.out.println(topVolume);
		
		
	}

public static void testLowestStock() throws ParseException {
	
	
	List<Stock> leastStock = stockRepository.findTop3ByCodeOrderByStockCloseAsc("NFLX");
	
	System.out.println(leastStock);
	
	
}

}
