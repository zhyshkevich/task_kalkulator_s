package com.solanake.kalkulator;

import com.solanake.kalkulator.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(AppConfig.class)
public class KalkulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KalkulatorApplication.class, args);
    }
}
