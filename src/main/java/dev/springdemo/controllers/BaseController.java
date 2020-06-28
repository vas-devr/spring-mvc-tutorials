/**
 *
 *
 * @createdOn Jun 15, 2020
 *
 * @author vasudev
 */


package dev.springdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * Description about this class ....
 *
 * @author vasudev
 * @createdOn Jun 15, 2020
 * @since v1.0.0-00
 *
 */

@Controller
public class BaseController {
	
	@RequestMapping("/")
	public String getMain() {

		return "main-view";

	}

}
