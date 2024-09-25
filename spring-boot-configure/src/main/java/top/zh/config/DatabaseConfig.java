package top.zh.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {
    @Value("${db.url}")
    private String Url;

    @Value("${db.username}")
    private String Username;

    @Value("${db.password}")
    private String Password;

    @Value("${db.driver-class-name}")
    private String DriverClassName;

    @Bean
    public DataSource dataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(Url);
        dataSource.setUsername(Username);
        dataSource.setPassword(Password);
        dataSource.setDriverClassName(DriverClassName);
        return dataSource;
    }
}
