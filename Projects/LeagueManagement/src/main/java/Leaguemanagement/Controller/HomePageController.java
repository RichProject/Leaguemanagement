package Leaguemanagement.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class HomePageController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView initForm(HttpServletRequest request) {
		
			return new ModelAndView("index");
		}

}
