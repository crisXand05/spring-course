package com.chr.IoC;

public class BossEmployee implements Employe {
    private ReportInterface newReport;
    private String companyName, email;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
