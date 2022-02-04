package site.liuye.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import site.liuye.demo.entity.Student;

@RestController
public class MainController {
	@RequestMapping("/info")
	public String info() throws JsonProcessingException {
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString("123");
	}

	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		Student student = new Student(1, "LiuYe");
		mav.setViewName("index");
		mav.addObject("student", student);
		return mav;
	}
}
