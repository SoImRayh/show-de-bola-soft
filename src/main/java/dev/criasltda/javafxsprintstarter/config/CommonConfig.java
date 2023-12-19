package dev.criasltda.javafxsprintstarter.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.ResourceBundle;

@Configuration
@RequiredArgsConstructor
public class CommonConfig {

    private final Environment environment;
    @Bean
    public ResourceBundle resourceBundle () {
        return ResourceBundle.getBundle("Bundle");
    }

    @Bean
    public DataSource dataSource(){
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("database.driverClassName"));
        dataSource.setUrl(environment.getProperty("database.url"));
        dataSource.setUsername(environment.getProperty("database.username"));
        dataSource.setPassword(environment.getProperty("database.password"));
        return dataSource;
    }
}
