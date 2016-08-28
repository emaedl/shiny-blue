package shinyBlueSpringBootWeb.shinyBlueSpringBootWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	private final MyConfiguration configuration;

	@Autowired
	public MyService(MyConfiguration configuration) {
		this.configuration = configuration;
	}
}
