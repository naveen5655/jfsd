package com.avk;

import java.util.List;
import java.util.Optional;

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
	public ModelAndView addProduct(int pID, String pName, double pCost) {
		Product p = new Product();
		p.setpID(pID);
		p.setpName(pName);
		p.setpCost(pCost);
		
		repo.save(p);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("success.jsp");
		return mv;
	}
	
	@RequestMapping("updateProduct")
	public ModelAndView updateProduct(Product p) {
		ModelAndView mv = new ModelAndView();
		
		repo.save(p);
		
		mv.setViewName("success.jsp");
		return mv;
	}
	
	@RequestMapping("deleteProduct")
	public ModelAndView deleteProduct(int pID) {
		ModelAndView mv = new ModelAndView();
		
		repo.deleteById(pID);
		
		
		mv.setViewName("success.jsp");
		return mv;
	}
	
	
	@RequestMapping("viewProducts")
	public ModelAndView viewProducts() {
		ModelAndView mv = new ModelAndView();
		
		List<Product> pList = repo.findAll();
	//	Optional<Product> p =repo.findById(111);
		mv.addObject("products", pList);
		
		mv.setViewName("view_products.jsp");
		return mv;
	}
	

}
