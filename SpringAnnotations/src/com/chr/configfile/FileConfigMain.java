package com.chr.configfile;

import com.chr.annotations.Employe;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FileConfigMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigApplication.class);
        /*Employe employeAccouting = ctx.getBean("getAccoutingEmployeBean", Employe.class);
        System.out.println(employeAccouting.getTask());
        System.out.println(employeAccouting.getReport());*/
        AccoutingEmploye accoutingEmploye = ctx.getBean("getAccoutingEmployeBean", AccoutingEmploye.class);
        System.out.println((accoutingEmploye.getEmail()));
        System.out.println((accoutingEmploye.getCompanyName()));


    }
}
