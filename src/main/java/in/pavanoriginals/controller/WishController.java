package in.pavanoriginals.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishController {
	
	@GetMapping
	public String wise() {
		return "hello welcom to pavanoriginals";
	}

}
