package com.chr.configfile;

import com.chr.annotations.ReportInterface;

public class AccoutingReport implements ReportInterface {
    @Override
    public String getReport() {
        return "Reporte de contabilidad";
    }
}
