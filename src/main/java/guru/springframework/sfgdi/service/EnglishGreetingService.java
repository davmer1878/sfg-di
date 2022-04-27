package guru.springframework.sfgdi.service;

public class EnglishGreetingService implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Hello World - EN";
    }
}
