package guru.springframework.sfgdi.service;

import guru.springframework.sfgdi.repository.LanguageGreetingRepository;

public class LanguageGreetingService implements GreetingService
{
    private final LanguageGreetingRepository languageGreetingRepository;

    public LanguageGreetingService(LanguageGreetingRepository languageGreetingRepository)
    {
        this.languageGreetingRepository = languageGreetingRepository;
    }

    @Override
    public String sayGreeting()
    {
        return languageGreetingRepository.getGreeting();
    }
}
