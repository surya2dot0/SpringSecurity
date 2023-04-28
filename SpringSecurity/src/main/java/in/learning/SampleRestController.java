package in.learning;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

	public String welcome() {
		return "Welcome";
	}
}
