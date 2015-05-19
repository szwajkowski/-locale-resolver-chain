package pl.szwajkowski;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(LocaleConfiguration.class)
@ComponentScan("pl.szwajkowski")
public class LocaleResolverChainApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocaleResolverChainApplication.class, args);
    }
}
