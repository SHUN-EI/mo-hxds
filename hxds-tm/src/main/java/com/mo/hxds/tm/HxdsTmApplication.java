package com.mo.hxds.tm;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by mo on 2023/2/27
 */
@SpringBootApplication
@EnableTransactionManagerServer
public class HxdsTmApplication {

    public static void main(String[] args) {
        SpringApplication.run(HxdsTmApplication.class, args);
    }
}
