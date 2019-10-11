package com.soeasy.top.admin;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;
import java.net.InetAddress;
import java.net.UnknownHostException;
@Slf4j
@SpringBootApplication
@ComponentScan(value = "com.soeasy.top")
public class TopAdminApplication {

    public static void main(String[] args) throws UnknownHostException {
        ConfigurableEnvironment env = SpringApplication.run(TopAdminApplication.class, args).getEnvironment();
        String port = env.getProperty("server.port");
        log.info("Access URLs:\n----------------------------------------------------------\n\t"
                        + "Local: \t\thttp://127.0.0.1:{}\n\t"
                        + "External: \thttp://{}:{}\n\t"
                        +"Swagger2ui: \thttp://127.0.0.1:{}/swagger-ui.html\n\t----------------------------------------------------------",
                port, InetAddress.getLocalHost().getHostAddress(), port,port);

        log.info("AdminApplication  START SUCCESS ....");
    }

}
