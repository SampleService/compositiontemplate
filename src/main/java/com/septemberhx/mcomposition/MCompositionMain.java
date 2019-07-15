package com.septemberhx.mcomposition;

import com.septemberhx.mclient.annotation.MClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MClient
public class MCompositionMain {

    public static void main(String[] args) {
        SpringApplication.run(MCompositionMain.class, args);
    }
}
