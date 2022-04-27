package guru.springframework.sfgdi.service;

public class CatPetService implements PetService
{
    @Override
    public String getPetType()
    {
        return "Cats Are the Best!";
    }
}
