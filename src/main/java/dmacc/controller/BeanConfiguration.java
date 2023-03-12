/**
 * @author Lia Kruger - alkruger2
 * CIS175 - Spring 2023
 * Mar 11, 2023
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Info;
import dmacc.beans.Location;

@Configuration
public class BeanConfiguration {
	
	@Bean
		public Location location() {
		Location bean = new Location("Paris");
		//bean.setCountry("America");
		//bean.setCity("Ames");
		//bean.setPostalcode("50014");
		return bean;
	}
	
	@Bean
		public Info info() {
			Info bean = new Info("2.161 million", "Eiffel Tower", "French");
			return bean;
	}
}
