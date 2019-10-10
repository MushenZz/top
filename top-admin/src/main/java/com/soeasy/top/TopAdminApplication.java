package com.soeasy.top;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Slf4j
@SpringBootApplication
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")//添加mybatisplus中mapper扫描支持
public class TopAdminApplication {

    public static void main(String[] args) throws UnknownHostException {
        ConfigurableEnvironment env = SpringApplication.run(TopAdminApplication.class, args).getEnvironment();
        String port = env.getProperty("server.port");
        log.info("Access URLs:\n----------------------------------------------------------\n\t"
                        + "Local: \t\thttp://127.0.0.1:{}\n\t"
                        + "External: \thttp://{}:{}\n----------------------------------------------------------",
                port, InetAddress.getLocalHost().getHostAddress(), port);

        log.info("AdminApplication  START SUCCESS ....");
    }

}
