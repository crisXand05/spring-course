package com.chr.configfile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/com/chr/configFile/dataCompany.properties")
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
