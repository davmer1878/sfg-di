package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.service.CatPetService;
import guru.springframework.sfgdi.service.DogPetService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class PetServiceConfig
{
    @Profile("cat")
    @Bean
    CatPetService catPetService()
    {
        return new CatPetService();
    }

    @Profile({"dog", "default"})
    @Bean
    DogPetService dogPetService()
    {
        return new DogPetService();
    }
}
