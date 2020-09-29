package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@ResponseBody
	 @RequestMapping(value = "/hello", method = RequestMethod.GET, produces="text/plain;charset=UTF-8")
	 public String lottoStore(HttpServletRequest request) throws IOException {
		return "HelloWorld!!!!";
	}
}
