package com.example.medicalsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.medicalsystem.mapper") // 添加了这一行，注意导包
public class MedicalSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicalSystemApplication.class, args);
    }

}