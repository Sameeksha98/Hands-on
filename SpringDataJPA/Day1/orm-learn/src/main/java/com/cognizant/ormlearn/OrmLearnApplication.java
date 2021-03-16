package com.cognizant.ormlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
@SpringBootApplication
public class OrmLearnApplication {

	private static CountryService countryService;
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	
	public static void main(String[] args) throws CountryNotFoundException {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

		countryService = context.getBean(CountryService.class);
		LOGGER.info("Inside main");
		testGetAllCountries();
		getAllCountriesTest();
		testAddCountry();
		testUpdateCountry();
		testDeleteCountry();
	}
	
	private static void testGetAllCountries() {

		LOGGER.info("Start");

		List<Country> countries = countryService.getAllCountries();

		LOGGER.debug("countries={}", countries);

		LOGGER.info("End");

		}
	
	private static void getAllCountriesTest() throws CountryNotFoundException {

		LOGGER.info("Start");

		Country country = countryService.findCountryByCode("IN");

		LOGGER.debug("Country:{}", country);

		LOGGER.info("End");

		}
	
	private static void testAddCountry() throws CountryNotFoundException {
		Country country = new Country();
		country.setCode("ZZ");
		country.setName("ABC");
		
		countryService.addCountry(country);
		
		LOGGER.info("Start addCountry");
		Country countryTest = countryService.findCountryByCode("ZZ");
		LOGGER.debug("Country:{}", countryTest);

		LOGGER.info("End addCountry");
		
	}
	
	private static void testUpdateCountry() throws CountryNotFoundException {
		
		
		countryService.updateCountry("ZZ","XYZ");
		
		LOGGER.info("Start updateCountry");
		Country countryTest = countryService.findCountryByCode("ZZ");
		LOGGER.debug("Country:{}", countryTest);

		LOGGER.info("End updateCountry");
		
	}
	
private static void testDeleteCountry() throws CountryNotFoundException {
		
		
		countryService.deleteCountry("ZZ");
		
		/*
		 * LOGGER.info("Start deleteCountry");
		 * 
		 * Country countryTest = countryService.findCountryByCode("ZZ");
		 * LOGGER.debug("Country:{}", countryTest);
		 * 
		 * LOGGER.info("End deleteCountry");
		 */
		
	}
}
