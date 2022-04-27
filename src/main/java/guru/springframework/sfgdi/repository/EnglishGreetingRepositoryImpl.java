package guru.springframework.sfgdi.repository;

public class EnglishGreetingRepositoryImpl implements LanguageGreetingRepository
{
    @Override
    public String getGreeting()
    {
        return "Hello World - EN";
    }
}
