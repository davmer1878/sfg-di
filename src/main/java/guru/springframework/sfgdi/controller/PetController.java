package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PetController
{
    private final PetService petService;

    @Autowired
    public PetController(PetService petService)
    {
        this.petService = petService;
    }

    public String whichPetIsTheBest()
    {
        return petService.getPetType();
    }
}
