package io.github.givamarques;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration {//classe apenas de configuracoes (bean, dados, email)

    @Bean (name = "applicationName")
    public String applicationName(){
        return "Sistema de Vendas";
    }
}
