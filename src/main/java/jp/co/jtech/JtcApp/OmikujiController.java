package jp.co.jtech.JtcApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OmikujiController {
	
	@RequestMapping("/omikuji/welcome")
	public String welcome(Model model) {
		model.addAttribute("omikujiEntity", new OmikujiEntity() );
		return "welcome";
	}
	
	@RequestMapping("/omikuji/omikuji")
	public String omikuji(@ModelAttribute OmikujiEntity omikujiEntity, Model model) {
		model.addAttribute("omikujiEntity", omikujiEntity);
		model.addAttribute("date", omikujiEntity);
		return "omikuji";
	}

}
