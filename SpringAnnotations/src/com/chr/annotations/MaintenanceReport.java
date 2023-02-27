package com.chr.annotations;

import org.springframework.stereotype.Component;

@Component
public class MaintenanceReport implements ReportInterface{
    @Override
    public String getReport() {
        return "Reporte de mantenimiento";
    }
}
