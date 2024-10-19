package ua.afek.springmvc.repository;

import ua.afek.springmvc.model.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GymRepository extends JpaRepository<Gym, Integer> {

}
