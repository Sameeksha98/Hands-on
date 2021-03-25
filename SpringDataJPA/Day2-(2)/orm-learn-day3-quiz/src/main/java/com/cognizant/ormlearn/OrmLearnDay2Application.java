package com.cognizant.ormlearn;



import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cognizant.ormlearn.model.Attempt;
import com.cognizant.ormlearn.model.AttemptOption;
import com.cognizant.ormlearn.model.AttemptQuestion;

import com.cognizant.ormlearn.service.AttemptService;



@SpringBootApplication
@ComponentScan("com.*")
public class OrmLearnDay2Application {

	@Autowired
	public static AttemptService attemptService;
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnDay2Application.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmLearnDay2Application.class, args);		

		attemptService = context.getBean(AttemptService.class);	
		testGetAttempt();
		testGetAttempt2();
	}

	public static void testGetAttempt() {
		Attempt attempt = attemptService.getAttempt(1, 1);
		LOGGER.debug("Attempt:",attempt);
	}

	public static void testGetAttempt2() {
		Attempt attempt = attemptService.getAttemptDetail(1, 1);
		Set<AttemptQuestion> attemptQuestions = attempt.getAttemptQuestion();
		for (AttemptQuestion attemptQuestion : attemptQuestions) {
			System.out.println(attemptQuestion.getQuestion().getText());
			Set<AttemptOption> attemptOptions = attemptQuestion.getAttemptOption();
			int i = 1;
			for (AttemptOption attemptOption : attemptOptions) {
				System.out.print(i + ")\t");
				System.out.print(attemptOption.getOptions().getText() + "\t");
				System.out.print(attemptOption.getOptions().getScore() + "\t");
				System.out.println(attemptOption.isSelected());
				i++;
			}
		}
	}



	

}
