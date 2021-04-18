package com.spring.boot.certification;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.boot.certification.config.HumanConfig;
import com.spring.boot.certification.injection.models.Human;
import com.spring.boot.certification.injection.models.Parent;

@SpringBootTest
class CertificationApplicationTests {

	@Test
	void contextLoads() {
		ConfigurableApplicationContext ctx =
				new AnnotationConfigApplicationContext(HumanConfig.class);
		
		Human parentHumanBean = ctx.getBean(Parent.class);
		
		assertNotNull(parentHumanBean);
	}

}
