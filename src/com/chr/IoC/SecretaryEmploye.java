package com.chr.IoC;

public class SecretaryEmploye implements Employe {
    private ReportInterface newReport;
    private String companyName, email;
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

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
