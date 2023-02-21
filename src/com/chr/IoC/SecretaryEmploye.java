package com.chr.IoC;

public class SecretaryEmploye implements Employe {
    private ReportInterface newReport;

    public SecretaryEmploye(ReportInterface newReport) {
        this.newReport = newReport;
    }

    @Override
    public String getTasks() {
        return "Gestionar la agenda de los jefes";
    }

    @Override
    public String getReport() {
        return "Informe presentado por el secretario" + newReport.getReports();
    }
}
