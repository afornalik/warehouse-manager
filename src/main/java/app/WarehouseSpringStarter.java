package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication()
@EntityScan(basePackages = "entity")

public class WarehouseSpringStarter {

    public static void main(String[] args) {
        SpringApplication.run(WarehouseSpringStarter.class, args);
    }
}

