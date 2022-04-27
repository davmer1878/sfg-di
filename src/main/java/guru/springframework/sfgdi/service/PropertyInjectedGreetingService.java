package guru.springframework.sfgdi.service;

public class PropertyInjectedGreetingService implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Hello World - Property";
    }
}
