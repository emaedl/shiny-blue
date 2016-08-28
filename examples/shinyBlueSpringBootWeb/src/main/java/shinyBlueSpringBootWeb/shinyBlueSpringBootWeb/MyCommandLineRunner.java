package shinyBlueSpringBootWeb.shinyBlueSpringBootWeb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order
public class MyCommandLineRunner implements CommandLineRunner{

	@Value("${name}")
	private String name;
	
	@Value("${my.secret}")
	private String secret;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("This is the command line runner, running code before application start \n");
		System.out.println("Application is running on port " + System.getProperty("local.server.port") + "\n");
		System.out.println("property name: " + name + "\n");
		System.out.println("property secret: " + secret + "\n");
	}

}
