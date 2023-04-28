package in.learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

	@GetMapping("/welcome")
	public String welcome() {
		
		return "Welcome";
	}
	@GetMapping("/about")
	public String about() {
		
		return "About";
	}
	@GetMapping("/transfer")
	public String transfer() {
		
		return "transfer";
	}
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
}
