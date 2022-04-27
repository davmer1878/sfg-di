package guru.springframework.sfgdi.repository;

public class SpanishGreetingRepositoryImpl implements LanguageGreetingRepository
{
    @Override
    public String getGreeting()
    {
        return "Hola Mundo - ES";
    }
}
