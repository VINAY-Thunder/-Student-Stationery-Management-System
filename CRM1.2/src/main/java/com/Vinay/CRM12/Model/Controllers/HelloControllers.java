package com.Vinay.CRM12.Model.Controllers;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.Vinay.CRM12.Model.GeometryBoxSale;
import com.Vinay.CRM12.Service.Iservice;

@Controller
//@RestController
public class HelloControllers {
	
	private Iservice service;
	
	@Autowired
	public void setService(Iservice service) {
		this.service = service;
	}

	@GetMapping("/info")
	public String GeometryInfo(Model model) {
		Iterable<GeometryBoxSale> geoInfo = service.FindAllGeometry();
		model.addAttribute("Ginfo", geoInfo);
		return "welcomePage-1";
	}
	
	@GetMapping("/showForm")
	public String ShowForm(Model model) {
		model.addAttribute("boxes12", new GeometryBoxSale());
		System.out.println("in showform");
		return "Show-form";
	}
	
	@PostMapping("/saveItem")
	public String Registergeometry(Model model,@ModelAttribute("boxes12")GeometryBoxSale geobox) {
		System.out.println("in post method");
		service.registerGeometry(geobox);
//		model.addAttribute("boxes", service.registerGeometry(geobox));
		return"redirect:/info";
	}
	
	@GetMapping("/update-form")
	public String UpdateForm(@RequestParam("geoId")Long id,Model model) {
		System.out.println("in Update-Form");
		model.addAttribute("boxes12", service.fetchCustomerById(id));
		return"UpdateForm";
	}
	
	@GetMapping("/delete-data")
	public String DeleteData(@RequestParam("geoId")Long id) {
		service.Removegeometry(id);
		return"redirect:/info";
	}
}
