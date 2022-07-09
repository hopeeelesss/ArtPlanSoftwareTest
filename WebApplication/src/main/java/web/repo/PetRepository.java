package web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.model.Pet;
import web.model.User;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
    Pet findPetById(Long id);
    Pet findPetByName(String name);
    List<Pet> findAllByUser_Id(User user);
}
