package docker.spring.boot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	// http://localhost:8080/demo
	@GetMapping
	public ResponseEntity<String> downloadFileToFTP() {
		return ResponseEntity.ok().body("<H1>CARAMELO</H1>");
	}

}
