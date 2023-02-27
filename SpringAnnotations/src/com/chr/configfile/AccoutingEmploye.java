package com.chr.configfile;

import com.chr.annotations.Employe;

public class AccoutingEmploye implements Employe {
    private AccoutingReport report;

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
