package dik.currencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.sql.SQLException;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyConversionApplication {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(CurrencyConversionApplication.class, args);
        //Console.main(args);
    }
}
