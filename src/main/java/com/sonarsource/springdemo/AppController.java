package com.sonarsource.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

	@Autowired
    DataUtils du;

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}

	@RequestMapping("/person/address")
    public @ResponseBody String getAddress(@RequestParam String name) {
        return du.getAddress(name);
    }

}