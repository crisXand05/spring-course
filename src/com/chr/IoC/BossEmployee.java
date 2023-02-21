package com.chr.IoC;

public class BossEmployee implements Employe {
    private ReportInterface newReport;

    public void setNewReport(ReportInterface newReport) {
        this.newReport = newReport;
    }

    public String getTasks() {
        return "Gestiono las cuestiones relativas a mis empleados de seccion";
    }

    @Override
    public String getReport() {
        return "Reporte generado por el jefe: " + newReport.getReports();
    }
}
