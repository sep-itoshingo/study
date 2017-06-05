package com.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * springBootサンプルControllerクラス
 * @author shingo_ito
 *
 */
@Controller
@EnableAutoConfiguration
public class ExampleController {

	/**
	 * 「Hello World!!」を表示するだけ
	 * @param model
	 * @return
	 */
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("value", "Hello World!!");
		return "index";
	}
}
