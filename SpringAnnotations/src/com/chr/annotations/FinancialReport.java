package com.chr.annotations;

import org.springframework.stereotype.Component;

@Component
public class FinancialReport implements ReportInterface{
    @Override
    public String getFinancialReport() {
        return "Informe financiero";
    }
}
