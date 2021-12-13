package co.usa.ciclo4.ciclo4;

import co.usa.ciclo4.ciclo4.Repository.crud.OrderCrudRepository;
import co.usa.ciclo4.ciclo4.Repository.crud.UserCrudRepository;
import co.usa.ciclo4.ciclo4.Repository.crud.cloneCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = ("co.usa.ciclo4.ciclo4.Modelo"))
@SpringBootApplication

public class Ciclo3Application implements CommandLineRunner{
        @Autowired
        private cloneCrudRepository cloneRepo;
        
        @Autowired
        private UserCrudRepository userRepo;
        
        @Autowired
        private OrderCrudRepository orderCrudRepository;
        
        
	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);
        }
        
        public void run(String... args) throws Exception{
        
            cloneRepo.deleteAll();
            userRepo.deleteAll();
            orderCrudRepository.deleteAll(); 
        }

}
