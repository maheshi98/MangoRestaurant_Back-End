package com.example.mango_restaurant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mango_restaurant.Model.MenuDetails;

@Repository
public interface MenuRepository extends JpaRepository<MenuDetails, String>{
	


}
