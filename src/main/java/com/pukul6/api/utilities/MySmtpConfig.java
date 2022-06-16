package com.pukul6.api.utilities;

import dev.ditsche.mailo.config.SmtpConfig;
import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class MySmtpConfig extends SmtpConfig {
	@Builder
	public MySmtpConfig(String username, String password, String host, int port, boolean ssl) {
		super.setUsername(username);
		super.setPassword(password);
		super.setHost(host);
		super.setPort(port);
		super.setSsl(ssl);
	}
}
