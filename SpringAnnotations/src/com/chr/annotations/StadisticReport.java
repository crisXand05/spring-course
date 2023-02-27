package com.chr.annotations;

import org.springframework.stereotype.Component;

@Component
public class StadisticReport implements ReportInterface{
    @Override
    public String getReport() {
        return "Estadisticas del anio";
    }
}
