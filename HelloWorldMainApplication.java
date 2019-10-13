package AlgorithmByBai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;



@SpringBootApplication
public class HelloWorldMainApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HelloWorldMainApplication.class);
    }

    public static void main(String[] args) {
        //  Spring应用主程序
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
