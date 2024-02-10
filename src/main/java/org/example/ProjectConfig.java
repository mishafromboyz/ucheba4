package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig
{
//    @Bean
//    public Cat cat()
//    {
//        Cat c = new Cat();
//        c.setName("boris");
//        return c;
//    }
//
//    @Bean
//    public Person person(Cat cat)
//    {
//        Person p = new Person();
//        p.setName("vlad");
//        p.setCat(cat);
//        return p;
//    }
}
