package ee.itcollege.i377.praktikum6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuardController {
	
	@RequestMapping("/guardForm")
	public String guardForm(@ModelAttribute Guard formInput, Model model) {
		System.out.println(formInput.getName());
		System.out.println(formInput.getAge());
		
		model.addAttribute("addedGuard", formInput);
		
		return "guard";
	}



}
