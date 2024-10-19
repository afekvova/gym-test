package ua.afek.springmvc.service;

import ua.afek.springmvc.model.Gym;
import ua.afek.springmvc.repository.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class GymService {

    @Autowired
    private GymRepository gymRepository;

    public void addGym(Gym gym) {
        gymRepository.save(gym);
    }

    public Gym getGym(int id) {
        return gymRepository.getById(id);
    }

    public void update(Gym gym) {       // .findByGymId()  <=== NO
        var updateGym = gymRepository.findById(gym.getGymId()).orElseThrow(() -> new EntityNotFoundException("GymId: " + gym.getGymId() + " not found."));
        updateGym.setName(gym.getName());
        updateGym.setStreet1(gym.getStreet1());
        updateGym.setStreet2(gym.getStreet2());
        updateGym.setCity(gym.getCity());
        updateGym.setState(gym.getState());
        updateGym.setZip(gym.getZip());
        gymRepository.save(updateGym);
    }
}
