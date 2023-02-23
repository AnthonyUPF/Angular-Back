package com.ironhack.demosecurityjwt;



import com.ironhack.demosecurityjwt.models.Role;
import com.ironhack.demosecurityjwt.models.SchoolClassModel.SchoolClass;


import com.ironhack.demosecurityjwt.repositories.SchoolClassRepository.SchoolClassRepository;
import com.ironhack.demosecurityjwt.services.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoSecurityJwtApplication implements CommandLineRunner{

   @Autowired
   SchoolClassRepository schoolClassRepository;




    public static void main(String[] args) {
        SpringApplication.run(DemoSecurityJwtApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }


    @Bean
    CommandLineRunner run(UserService userService) {


        return args -> {
            userService.saveRole(new Role( "ROLE_USER"));
            userService.saveRole(new Role( "ROLE_ADMIN"));

              /*

            userService.saveRole(new Role( "ROLE_ACCOUNT_HOLDER"));
            userService.saveRole(new Role( "ROLE_THIRD_PARTY"));



            userService.saveUser(new User("John Doe", "john", "1234"));
            userService.saveUser(new User("James Smith", "james", "1234"));
            userService.saveUser(new User("Jane Carry", "jane", "1234"));
            userService.saveUser(new User("Chris Anderson", "chris", "1234"));

            userService.addRoleToUser("john", "ROLE_USER");
            userService.addRoleToUser("james", "ROLE_ADMIN");

            userService.addRoleToUser("jane", "ROLE_ACCOUNT_HOLDER");

            userService.addRoleToUser("chris", "ROLE_ADMIN");
            userService.addRoleToUser("chris", "ROLE_USER");

               */

        };


    }


    @Override
    public void run(String... args) throws Exception {

        schoolClassRepository.save(new SchoolClass("Math", "Learn math"));
        schoolClassRepository.save(new SchoolClass("Science", "Learn science"));
        schoolClassRepository.save(new SchoolClass("History", "Learn history"));
        schoolClassRepository.save(new SchoolClass("English", "Learn English"));
        schoolClassRepository.save(new SchoolClass("Art", "Learn art"));
        schoolClassRepository.save(new SchoolClass("Music", "Learn music"));
        schoolClassRepository.save(new SchoolClass("Physical Education", "Stay fit"));
        schoolClassRepository.save(new SchoolClass("Computer Science", "Learn programming"));
        schoolClassRepository.save(new SchoolClass("Spanish", "Learn Spanish"));
        schoolClassRepository.save(new SchoolClass("French", "Learn French"));

    }



}
