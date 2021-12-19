package com.usa.ciclo4.retociclo4;

import com.usa.ciclo4.retociclo4.repository.crudrepository.OrderCrudRepository;
import com.usa.ciclo4.retociclo4.repository.crudrepository.GadgetCrudRepository;
import com.usa.ciclo4.retociclo4.repository.crudrepository.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RetoCiclo4Application implements CommandLineRunner {
    @Autowired
    private GadgetCrudRepository gadgetCrudRepository;
    @Autowired
    private UserCrudRepository userCrudRepository;
    @Autowired
    private OrderCrudRepository orderCrudRepository;

    public static void main(String[] args) {
        SpringApplication.run(RetoCiclo4Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        gadgetCrudRepository.deleteAll();
        userCrudRepository.deleteAll();
        orderCrudRepository.deleteAll();
    }
}
