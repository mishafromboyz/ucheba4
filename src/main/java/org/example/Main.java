package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = context.getBean(Person.class);
        //Cat c = context.getBean(Cat.class);

        System.out.println(p.getName() + " owns " + p.getCat());
    }
}
