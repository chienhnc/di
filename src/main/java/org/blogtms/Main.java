package org.blogtms;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@SpringBootApplication
public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(Main.class, args);
//
//        Girl girl = context.getBean(Girl.class);

        Injector injector = Guice.createInjector(new GuiceModule());

        Girl girl = injector.getInstance(Girl.class);
    }
}