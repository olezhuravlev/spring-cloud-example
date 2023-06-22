package dik.rentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.sql.SQLException;

@SpringBootApplication
@EnableDiscoveryClient
public class RentServiceApplication {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(RentServiceApplication.class, args);
        //Console.main(args);
    }
}
