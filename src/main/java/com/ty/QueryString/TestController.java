package com.ty.QueryString;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/getId")
	public int getId(@RequestParam int id) {
		return id;
	}

	@GetMapping("/emp")
	public String employeeInfo(@RequestParam String eid, @RequestParam long ephone) {
		return "Employee Id" + eid + "\n Employee Contact " + ephone;
	}

}
