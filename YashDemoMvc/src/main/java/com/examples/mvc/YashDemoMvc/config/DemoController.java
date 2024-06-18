package com.examples.mvc.YashDemoMvc.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.examples.mvc.YashDemoMvc.model.Product;

@Controller
@RequestMapping(value = "/products")
public class DemoController {
	@RequestMapping(value = "/test1")
	public String test(HttpServletResponse response,HttpServletRequest request) throws IOException{
		request.setAttribute("name", "yaswanth");
		request.setAttribute("city", "ponduru");
		return "demojsp";
	}
	@RequestMapping(value = "/productsItems")
	public ModelAndView test2(HttpServletResponse response) throws IOException{
		Product p1 = new Product(101, "mangoes", 12, 30);
		Product p2 = new Product(102, "apple", 23, 20);
		Product p3 = new Product(103, "banana", 30, 10);
		Product p4 = new Product(104, "grapes", 6, 40);
		List<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		return new ModelAndView("test2","products", products);
	}
}
