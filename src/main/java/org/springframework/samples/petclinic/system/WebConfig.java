package org.springframework.samples.petclinic.system;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.UrlHandlerFilter;

@Configuration
class WebConfig {

    // Spring Framework 6 no longer maps "/owners/find/" to "/owners/find"; keep the
    // trailing slash URLs that worked with Spring Boot 1.5.
    @Bean
    UrlHandlerFilter trailingSlashUrlHandlerFilter() {
        return UrlHandlerFilter.trailingSlashHandler("/**").wrapRequest().build();
    }

}
