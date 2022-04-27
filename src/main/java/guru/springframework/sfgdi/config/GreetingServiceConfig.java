package guru.springframework.sfgdi.config;

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

    @Profile("EN")
    @Bean("internationalisationService")
    EnglishGreetingService englishGreetingService()
    {
        return new EnglishGreetingService();
    }

    @Profile({"ES", "default"})
    @Bean("internationalisationService")
    SpanishGreetingService spanishGreetingService()
    {
        return new SpanishGreetingService();
    }
}
