package com.cole2aj_Assignment0.cole2aj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

	@RequestMapping("/start")
	public String start() {
		return "start";
	}
}
