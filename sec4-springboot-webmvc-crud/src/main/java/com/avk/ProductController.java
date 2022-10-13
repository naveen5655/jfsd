package com.avk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	
	@Autowired
	ProductRepo repo;

	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("addProduct")
	public String addProduct(Product p) {
		repo.save(p);
		return "success.jsp";
	}
	
	@RequestMapping("updateProduct")
	public String updateProduct(Product p) {
		repo.save(p);
		return "success.jsp";
	}
	
	@RequestMapping("deleteProduct")
	public ModelAndView deleteProduct(int pID) {
		repo.deleteById(pID);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("success.jsp");
		return mv;
	}
	
	@RequestMapping("viewProducts")
	public ModelAndView viewProducts() {
		List<Product> products = repo.findAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("products", products);
		mv.setViewName("view_products.jsp");
		return mv;
	}
	
	
	
	
	
	
}
