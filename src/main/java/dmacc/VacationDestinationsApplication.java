package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Info;
import dmacc.beans.Location;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.LocationRepository;

@SpringBootApplication
public class VacationDestinationsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VacationDestinationsApplication.class, args);
	}
	
	@Autowired
	LocationRepository repo;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Location l = appContext.getBean("location", Location.class);
		l.setCity("Ankeny");
		repo.save(l);
		
		Location a = new Location("England", "London", "EC1A");
		Info b = new Info("8.982 million", "London Eye", "English");
		a.setInfo(b);
		repo.save(a);
		
		List<Location> allMyLocations = repo.findAll();
		for(Location places: allMyLocations) {
			System.out.println(places.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	
	}

}