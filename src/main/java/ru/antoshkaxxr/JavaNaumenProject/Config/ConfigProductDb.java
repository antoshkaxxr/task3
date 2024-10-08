package ru.antoshkaxxr.JavaNaumenProject.Config;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.antoshkaxxr.JavaNaumenProject.Entities.Product;

@Configuration
public class ConfigProductDb {
    @Bean
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public Map<Long, Product> productContainer() {
        return new HashMap<>();
    }
}
