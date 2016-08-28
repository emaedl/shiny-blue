package shinyBlueSpringBootWeb.shinyBlueSpringBootWeb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class MyArgBean {

	@Autowired
	public MyArgBean(ApplicationArguments args) {
		// TODO Auto-generated constructor stub
		boolean debug = args.containsOption("debug");
		List<String> files = args.getNonOptionArgs();
		// if run with "--debug logfile.txt" debug=true, files=["logfile.txt"]
	}
}
