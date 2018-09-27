package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * The front controller (Dispatcher Servlet) delegates to one or more controllers, like this one
 * Each method is a request handler and returns the name of a view (web-mvc) or some data (REST)
 */
@Controller
@RequestMapping("/")
public class MyController {

	@RequestMapping(method = RequestMethod.GET)
	public String showHomePage(Model model) {
		model.addAttribute("name", "krish");
		return "home"; // name of a view
	}
}
