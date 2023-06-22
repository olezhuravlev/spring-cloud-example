package dik.currencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyConversion2Application {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyConversion2Application.class, args);
        //Console.main(args);
    }
}
