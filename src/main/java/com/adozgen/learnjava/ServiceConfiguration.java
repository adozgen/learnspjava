package com.adozgen.learnjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.InvocationTargetException;

@Configuration
public class ServiceConfiguration {
    @Bean
    public IService service(){
        return createInstance("com.adozgen.learnjava.MockService");
    }
    private IService createInstance(String paymentType) {
        try {
            // Sınıfın adını kullanarak Class nesnesi elde etme
            Class<?> paymentClass = Class.forName(paymentType);
            // Class nesnesini kullanarak sınıfın bir örneğini oluşturma
            return (IService) paymentClass.getConstructor().newInstance();

        } catch (ClassNotFoundException | NoSuchMethodException e) {
            System.out.println("Sınıf bulunamadı.");
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
