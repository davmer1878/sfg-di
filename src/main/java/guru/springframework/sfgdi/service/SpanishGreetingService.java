package guru.springframework.sfgdi.service;

public class SpanishGreetingService implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Hola Mundo - ES";
    }
}
