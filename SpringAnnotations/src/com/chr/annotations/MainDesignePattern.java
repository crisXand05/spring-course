package com.chr.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDesignePattern {

    public static void main(String[] args){
        //ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationContext.class);
        Employe empleado1 = ctx.getBean("empleado", Employe.class);
        Employe empleado2 = ctx.getBean("empleado", Employe.class);
        if(empleado1 == empleado2) {
            System.out.println("Apuntan al mismo objeto");
            System.out.println(empleado1);
            System.out.println(empleado2);

        }
        else System.out.println("No apuntan a la misma direccion en memoria");
        ctx.close();
    }
}
