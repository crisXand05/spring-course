package com.chr.configfile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApplication {
    @Bean
    public AccoutingReport getAccoutingReportBean(){
        return new AccoutingReport();
    }
    @Bean
    public AccoutingEmploye getAccoutingEmployeBean(){
        return new AccoutingEmploye(getAccoutingReportBean());
    }
}
