package com.example.mango_restaurant.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mango_restaurant.Model.MenuDetails;
import com.example.mango_restaurant.Repository.MenuRepository;
import com.example.mango_restaurant.exception.ResourceNotFoundException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class MenuController {
	
	@Autowired
	private MenuRepository menuRepository;
	
	//get all menuDetails
	@GetMapping("/MenuDetails")
	public List<MenuDetails> getAllMenuDetails(){
		return menuRepository.findAll();
		
	}
	
	//create menu rest api
	@PostMapping("/MenuDetails")
	public MenuDetails createMenuDetails(@RequestBody MenuDetails MenuDetails) {
		
		return menuRepository.save(MenuDetails);
	}
	//delete  menu rest api
	
	@DeleteMapping("/MenuDetails/{foodCode}")
	public ResponseEntity<Map<String,Boolean>> deleteMenu(@PathVariable String foodCode){
		System.out.println("Here");
		MenuDetails MenuDetails = menuRepository.findById(foodCode).orElseThrow(()-> new ResourceNotFoundException("not found" + foodCode));
		
		menuRepository.delete(MenuDetails);
		Map<String , Boolean> response = new HashMap<>();
		response.put("deleted" , Boolean.TRUE);
		return ResponseEntity.ok(response);
		
	}
}
