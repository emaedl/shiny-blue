package shinyBlueSpringBootWeb.shinyBlueSpringBootWeb;

import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableConfigurationProperties(MyConfiguration.class)
public class Example implements ExitCodeGenerator {
	private static final Logger Log = LoggerFactory.getLogger(Example.class);
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(Example.class);
		Log.info("this is my logger");
		app.run(args);
	}
	
	@PreDestroy
	public void destroy () {
		System.out.println("Hello world: Help me I'm beeing destroyed\n");
	}

	@Override
	public int getExitCode() {
		return 99;
	}
}
