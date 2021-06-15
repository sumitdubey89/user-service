package epam.demo.userservice.controller;

import java.util.Collections;
import java.util.List;
import javax.jws.soap.SOAPBinding;
import epam.demo.userservice.model.User;
import epam.demo.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/userService")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@Value("${my.greetings}")
	private String myGreetings;

	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}

	@GetMapping("/users/{user_id}")
	public List<User> getUserDetail(@PathVariable("user_id") Integer userId){
		return userRepository.findAllById(Collections.singleton(userId));
	}

	@PostMapping("/users")
	public String saveUserDetails(@RequestBody final User user){
		userRepository.save(user);
		return (myGreetings+"!! The entry for the User is saved as follows : "+user.toString());
	}

	@DeleteMapping("/users/{user_id}")
	public String deleteUserEntry(@PathVariable("user_id") Integer userID){
		userRepository.deleteById(userID);
		return ("The User entry for ID :"+userID+" has been deleted");
	}

	@PutMapping("/users/{user_id}")
	public String updateUserEntry(@PathVariable("user_id") Integer userId,@RequestBody final User user){
			if(userId.equals(user.getId())){
				userRepository.save(user);
				return ("Entry for the user Id: "+userId+" has been updated");
			}
			return ("mismatch in userID in path and body");
	}
}
