package com.chr.IoC;

public class DirectorEmploye implements Employe {
    private ReportInterface newReport;

    public DirectorEmploye(Report newReport){
        this.newReport = newReport;
    }
    @Override
    public String getTasks() {
        return "Gestionar la plantilla de la empresa";
    }

    @Override
    public String getReport() {
        return "Reporte generado por el director: " + newReport.getReports();
    }
}
