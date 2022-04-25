package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("internationalisationService")
public class SpanishGreetingService implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Hola Mundo - ES";
    }
}
