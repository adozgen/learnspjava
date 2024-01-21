package com.adozgen.learnjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;


@SpringBootApplication
@ComponentScan(basePackages = {"com.adozgen.learnjava.genericCollectionExamples", "crm"})
public class LearnjavaApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(LearnjavaApplication.class, args);

		System.out.println(System.getProperty("os.name").toLowerCase());
		// Tüm bean isimlerini al ve yazdır
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			Object bean = ctx.getBean(beanName);
			if (bean.getClass().getPackage().getName().startsWith("com.adozgen")) {
				// Burada "com.mycompany" kendi paketinizin ismi olmalıdır.
				System.out.println(beanName);
			}

		}
	}

}
