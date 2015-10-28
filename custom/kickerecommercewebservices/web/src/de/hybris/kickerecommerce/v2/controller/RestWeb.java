/**
 *
 */
package de.hybris.kickerecommerce.v2.controller;

/**
 * @author kumar.shubham.misra
 *
 */
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RestWeb
{

	@RequestMapping("/test")
	public ModelAndView listUsers()
	{
		final RestTemplate restTemplate = new RestTemplate();
		final String url = "http://198.46.49.203:443/json/getRecommendations";

		final List<LinkedHashMap> users = restTemplate.getForObject(url, List.class);
		return new ModelAndView("listUsers", "users", users);
	}



}