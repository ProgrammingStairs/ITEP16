package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 Web annotations : 
  @RestController = @Controller + @ResponseBody 
  @Controller
  @GetMapping
  @PostMapping
  @PutMapping
  @DeleteMapping
  @PathVariable  
  @RequestParam 
  @RequestBody
  @ResponseBody
  @RequestMapping
*/

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
