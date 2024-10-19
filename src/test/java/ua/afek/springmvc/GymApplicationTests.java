package ua.afek.springmvc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import ua.afek.springmvc.exceptions.EntityNotFoundException;
import ua.afek.springmvc.model.Gym;
import ua.afek.springmvc.model.Person;
import ua.afek.springmvc.service.DataAccess;
import ua.afek.springmvc.service.GymService;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@SpringBootTest
class GymApplicationTests {

	private DataAccess dataAccess;

//	@Mock
//	private GymRepository gymRepository;

	@InjectMocks
	private GymService gymService;

	@BeforeEach
	void setUp() {
		dataAccess = new DataAccess();
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void getPeople_shouldReturnPersonList() {
		List<Person> people = dataAccess.getPeople();
		assertEquals(3, people.size());
	}

	@Test
	void findPerson_shouldReturnPersonById() {
		Person person = dataAccess.findPerson(1);
		assertEquals("Joe", person.getName());
	}

	@Test
	void findPerson_shouldThrowExceptionWhenPersonNotFound() {
		assertThrows(IndexOutOfBoundsException.class, () -> dataAccess.findPerson(999));
	}

//	@Test
//	void addGym_shouldSaveGym() {
//		Gym gym = new Gym();
//		gym.setGymId(1);
//		gym.setName("Test Gym");
//
//		gymService.addGym(gym);
//		verify(gymRepository, times(1)).save(gym);
//	}
//
//	@Test
//	void getGym_shouldReturnGymById() {
//		Gym gym = new Gym();
//		gym.setGymId(1);
//		when(gymRepository.getById(1)).thenReturn(gym);
//
//		Gym result = gymService.getGym(1);
//		assertEquals(1, result.getGymId());
//	}

//	@Test
//	void updateGym_shouldUpdateGymDetails() {
//		Gym gym = new Gym();
//		gym.setGymId(1);
//		gym.setName("Original Name");
//
//		Gym updatedGym = new Gym();
//		updatedGym.setGymId(1);
//		updatedGym.setName("Updated Name");
//
//		when(gymRepository.findById(1)).thenReturn(Optional.of(gym));
//
//		gymService.update(updatedGym);
//
//		assertEquals("Updated Name", gym.getName());
//		verify(gymRepository, times(1)).save(gym);
//	}
}
