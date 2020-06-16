/**
 *
 *
 * @createdOn Jun 16, 2020
 *
 * @author vasudev
 */


package dev.springdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * Hello world controller
 *
 * @author vasudev
 * @createdOn Jun 16, 2020
 * @since v1.0.0-00
 *
 */
@Controller
public class HelloWorldController {

	// controller to forward request to process form
	@RequestMapping("/processForm")
	public String processForm() {
		
		return "process-form";
		
	}

	// controller to forward request to show form
	@RequestMapping("/showForm")
	public String showForm() {
		
		return "hello-world-form";
		
	}
	
}
