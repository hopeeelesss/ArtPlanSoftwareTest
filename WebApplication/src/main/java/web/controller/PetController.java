package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import web.dto.PetDTO;
import web.model.Pet;
import web.service.PetService;

import java.util.List;

@Controller
@RequestMapping("/pet")
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @ModelAttribute("pet")
    public PetDTO petDTO(){return new PetDTO();}

    @GetMapping("/new")
    public String newPetForm(){
        return "pet_form";
    }

    @PostMapping()
    public String savePet(@ModelAttribute("pet") PetDTO petDTO){
        petService.save(petDTO);
        return "redirect:/";
    }

    @GetMapping("list")
    public String list(Model model){
        model.addAttribute("petList",petService.list());
        return "list";
    }
}
