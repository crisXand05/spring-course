package com.chr.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("empleado")
public class ExperiencedEmploy implements Employe {
    private FinancialReport report;
@Autowired
    public ExperiencedEmploy(FinancialReport report){
        this.report = report;
    }
    @Override
    public String getTask() {
        return "Vender";
    }

    @Override
    public String getReport() {
        return report.getFinancialReport();
    }
}
