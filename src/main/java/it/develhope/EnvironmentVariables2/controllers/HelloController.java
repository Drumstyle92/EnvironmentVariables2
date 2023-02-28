package it.develhope.EnvironmentVariables2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Drumstyle92
 * Controller class that handles the CRUD of calls
 */
@RestController
public class HelloController {

    /**
     * Automated instance of the Environment
     * interface in order to use methods derived
     * from it and to be able to read the properties of the various environments
     */
    @Autowired
    Environment environment;


    /**
     * @return Based on the environment selected, it returns a string
     * with a greeting and the name of the reference environment
     * Get method that returns a string based on the selected environment
     */
    @GetMapping("/")
    public String getHelloEnvironment(){

        return environment.getProperty("myCustomEnvs.welcomeMsg");

    }

}
