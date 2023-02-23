package com.chr.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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
        return report.getFinancialReport();
    }
}
