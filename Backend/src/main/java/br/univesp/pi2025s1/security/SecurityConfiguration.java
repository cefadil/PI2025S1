package br.univesp.pi2025s1.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http.csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/**").permitAll())
                // .requestMatchers(HttpMethod.GET, "/usuario/**").authenticated()
                // .requestMatchers(HttpMethod.POST, "/usuario/**").hasRole("ADMIN")
                // .requestMatchers(HttpMethod.PUT, "/usuario/**").hasRole("ADMIN")
                // .requestMatchers(HttpMethod.DELETE, "/usuario/**").hasRole("ADMIN")
                // .anyRequest().authenticated())
            .sessionManagement(sess -> sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .build();
    }

}
