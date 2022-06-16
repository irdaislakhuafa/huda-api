package com.pukul6.api.configuration;

import com.pukul6.api.utilities.MySmtpConfig;
import dev.ditsche.mailo.provider.MailProvider;
import dev.ditsche.mailo.provider.SmtpMailProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
	@Value(value = "${spring.}")
	@Bean
	public MailProvider mailProvider() {
		var config = MySmtpConfig.builder()
//				.username()
//				.password()
//				.host()
//				.port()
				.ssl(false)
				.build();
		return new SmtpMailProvider();
	}
}
