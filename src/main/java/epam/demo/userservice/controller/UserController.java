package epam.demo.userservice.controller;

import java.util.Collections;
import java.util.List;
import epam.demo.userservice.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/{userId}")
	public List<User> getUser(@PathVariable("userId") String userId){
		return Collections.singletonList(new User("Kamal",23,2019));

	}

}
