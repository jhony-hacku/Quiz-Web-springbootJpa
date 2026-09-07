package com.javeriana.quiz.config;

import org.h2.server.web.JakartaWebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuración manual de la consola web H2.
 *
 * En Spring Boot 4.x el servlet de H2 no se registra automáticamente
 * vía propiedades, por lo que se registra aquí explícitamente.
 *
 * Acceso: http://localhost:8080/h2-console
 */
@Configuration
public class H2ConsoleConfig {

    @Bean
    public ServletRegistrationBean<JakartaWebServlet> h2ConsoleServlet() {
        // JakartaWebServlet es la versión Jakarta EE del servlet de consola H2
        ServletRegistrationBean<JakartaWebServlet> bean =
                new ServletRegistrationBean<>(new JakartaWebServlet(), "/h2-console/*");

        // Permite conexiones desde cualquier origen
        bean.addInitParameter("webAllowOthers", "true");

        // Nombre del servlet
        bean.setName("H2Console");

        return bean;
    }
}
