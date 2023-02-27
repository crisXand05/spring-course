package com.chr.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("empleado")
public class ExperiencedEmploy implements Employe {
    //Dependency inyection with attribute
    @Autowired
    @Qualifier("maintenanceReport") //Indica que clase utilizara cuando hay varias clases que implemementen la interface report
    private ReportInterface report;
/*@Autowired
    public ExperiencedEmploy(FinancialReport report){
        this.report = report;
    }*/

    //Dependency inyection usint setter
/*@Autowired
    public void setReport(FinancialReport report) {
        this.report = report;
    }*/

    //Dependency inyection using whatever method
    /*@Autowired
    public void inyectionReport(FinancialReport report) {
        this.report = report;
    }*/
    @Override
    public String getTask() {
        return "Vender";
    }

    @Override
    public String getReport() {
        return report.getReport();
    }

    //ejecucion de codigo despues de creacion del bean
    @PostConstruct
    public void afterBean(){
        System.out.println("afterbean ejecutado");
    }

    //ejecucion despues de apagar el contenedor de spring
    @PreDestroy
    public void afterDestroyBean(){
        System.out.println("afterDestroyBean");
    }
}
