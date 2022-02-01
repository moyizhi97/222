package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.print.DocFlavor;

/**
 * @springbootapplication 这是一个springboot应用
 */
@SpringBootApplication
public class run {
    public static void main(String[] args){
        SpringApplication.run(run.class,args);
    }
}
