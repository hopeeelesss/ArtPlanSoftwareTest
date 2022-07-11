package web.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import web.dto.PetDTO;
import web.model.Pet;
import web.model.User;
import web.repo.PetRepository;
import web.repo.UserRepository;

import java.util.List;

@Service
public class PetService {
    private final PetRepository petRepository;
    private final UserRepository userRepository;


    public PetService(PetRepository petRepository, UserRepository userRepository) {
        this.petRepository = petRepository;
        this.userRepository = userRepository;
    }

    public List<Pet> list(){
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        return petRepository.findAllByUser_Id(userRepository.findByUsername(authentication.getName()).getId());
    }
    public Pet save(PetDTO petDTO){
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        Pet pet=new Pet(petDTO.getType(), petDTO.getBirthdate(), petDTO.getGender(), petDTO.getName());
        String username = authentication.getName();
        User user= userRepository.findByUsername(username);
        pet.setUser(user);
        return petRepository.save(pet);
    }
}
