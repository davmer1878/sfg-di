package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.repository.LanguageGreetingRepository;
import guru.springframework.sfgdi.repository.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.repository.SpanishGreetingRepositoryImpl;
import guru.springframework.sfgdi.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig
{
    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService()
    {
        return new PrimaryGreetingService();
    }

    @Bean
    ConstructorInjectedGreetingService constructorInjectedGreetingService()
    {
        return new ConstructorInjectedGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService()
    {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService()
    {
        return new SetterInjectedGreetingService();
    }

    @Bean
    LanguageGreetingRepository englishGreetingRepository()
    {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean("languageGreetingService")
    LanguageGreetingService englishGreetingService(LanguageGreetingRepository englishGreetingRepository)
    {
        return new LanguageGreetingService(englishGreetingRepository);
    }

    @Bean
    LanguageGreetingRepository spanishGreetingRepository()
    {
        return new SpanishGreetingRepositoryImpl();
    }


    @Profile({"ES", "default"})
    @Bean("languageGreetingService")
    LanguageGreetingService spanishGreetingService(LanguageGreetingRepository spanishGreetingRepository)
    {
        return new LanguageGreetingService(spanishGreetingRepository);
    }
}
