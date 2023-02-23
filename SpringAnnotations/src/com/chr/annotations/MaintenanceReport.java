package com.chr.annotations;

import org.springframework.stereotype.Component;

@Component
public class MaintenanceReport implements ReportInterface{
    @Override
    public String getFinancialReport() {
        return "Reporte de mantenimiento";
    }
}
