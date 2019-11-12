package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author franck Desmedt https://github.com/bigmoletos
 *
 */
@Controller
public class DoctorController {
//	 http://localhost:8080/?name=William Hartnell

	/**
	 * @description
	 *
	 * @return String
	 *
	 * @method doctor
	 * @class DoctorController
	 * @version 1.0
	 * @param model
	 * @param name
	 * @param number
	 * @date lundi 11 nov. 2019
	 * @see
	 *
	 **/
	@RequestMapping("/doctor")
	public String doctor(Model model,
			@RequestParam(value = "name", required = false, defaultValue = "John Smith") String name,
			@RequestParam(value = "number", required = false, defaultValue = "0") int number) {
		model.addAttribute("name", name);
		model.addAttribute("number", number);

		return "doctor";
	}

//	@RequestMapping("/doctor/{name}{id}")
//	@ResponseBody
//	public String choiceDoctor(@RequestParam(required = true, defaultValue = "John Smith") String name,
//			@PathVariable(required = false, value = "0") int id) {
//
//		String[] listeOfDoctors = { "William Hartnell", "Patrick Troughton", "Jon Pertwee", "Tom Baker",
//				"Peter Davison", "Colin Baker", "Sylvester McCoy", "Paul McGann", "Christopher Eccleston",
//				"David Tennant", "Matt Smith", "Peter Capaldi", "Jodie Whittaker" };
//		String reponse = null;
//		for (String listeOfDoctor : listeOfDoctors) {
//			if (id >= 0 && id < 13) {
//				reponse = "{\"number\":" + id + ", \"name\": " + listeOfDoctors[id - 1] + "}";
//				System.out.println(reponse);
//			}
//		}
//		return reponse;
//	}
}
