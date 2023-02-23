package com.chr.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ExperiencedEmploy empleado = ctx.getBean("empleado", ExperiencedEmploy.class);
        System.out.println(empleado.getTask());
        System.out.println(empleado.getReport());
        ctx.close();
    }
}