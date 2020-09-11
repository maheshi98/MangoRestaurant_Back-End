package com.example.mango_restaurant.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MenuDetails")
public class MenuDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private String FoodCode;
	@Column(name = "Image_URL ")
	private String ImageURL;
	@Column(name = "Category")
	private String Category;
	@Column(name = "Food_Name")
	private String FoodName;
	@Column(name = "Description")
	private String Description;
	@Column(name = "Price")
	private int Price;
	
	public MenuDetails() {
		
	}
	
	
	public MenuDetails(String imageURL, String category, String foodName, String description, int price) {
		super();
		ImageURL = imageURL;
		Category = category;
		FoodName = foodName;
		Description = description;
		Price = price;
	}
	public String getFoodCode() {
		return FoodCode;
	}
	public void setFoodCode(String foodCode) {
		FoodCode = foodCode;
	}
	public String getImageURL() {
		return ImageURL;
	}
	public void setImageURL(String imageURL) {
		ImageURL = imageURL;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getFoodName() {
		return FoodName;
	}
	public void setFoodName(String foodName) {
		FoodName = foodName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	

}
