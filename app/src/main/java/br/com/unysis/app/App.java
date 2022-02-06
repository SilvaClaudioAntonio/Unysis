package br.com.unysis.app;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(App.class, args);
		String[] javaBeans = context.getBeanDefinitionNames();
		Arrays.sort(javaBeans);
		
		for (String javaBeanName : javaBeans) {
			 System.out.println(javaBeanName);	
		}
	}
}
