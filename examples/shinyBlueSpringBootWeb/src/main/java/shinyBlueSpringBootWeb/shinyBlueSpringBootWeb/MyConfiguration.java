package shinyBlueSpringBootWeb.shinyBlueSpringBootWeb;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;

@ConfigurationProperties(prefix="connection")
@Profile("test")
public class MyConfiguration {

	@NotNull
	@Valid
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
