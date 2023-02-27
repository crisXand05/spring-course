package com.chr.configfile;

import com.chr.annotations.Employe;
import org.springframework.beans.factory.annotation.Value;

public class AccoutingEmploye implements Employe {
    private AccoutingReport report;
    @Value("${email}")
    private String email;
    @Value("${companyName}")
    private String companyName;

    public String getEmail() {
        return email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public AccoutingEmploye(AccoutingReport report){
        this.report = report;
    }
    @Override
    public String getTask() {
        return " Tareas de contabilidad de la empresa";
    }

    @Override
    public String getReport() {
        return report.getReport();
    }
}
