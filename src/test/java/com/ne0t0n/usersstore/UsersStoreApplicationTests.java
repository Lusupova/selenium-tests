package com.ne0t0n.usersstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Optional;

@SpringBootTest
class UsersStoreApplicationTests {

	@Autowired
	TestEntityManager entityManager;

	@Mock
	UserRepository userRepository;

	@BeforeEach
	public void setUp(){

	}


	@Test
	void testFindAll() {
		User user = new User(1L, "name", 20);

//		assertThat(1).isEqualTo(1);
//		entityManager.persistAndFlush(user);
//
//		var testUser = userRepository.findById(1L);
//
//		assertThat(testUser).isEqualTo(Optional.of(user));
//		when(userRepository.findById(1L)).thenReturn(Optional.of(user));
	}



}
