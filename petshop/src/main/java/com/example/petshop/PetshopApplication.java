package com.example.petshop;

import java.util.HashMap;

import javax.management.StringValueExp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController("pets")
@EnableAspectJAutoProxy

public class PetshopApplication {

	static HashMap<String, Pet> pets = new HashMap<String, Pet>();

	public static void main(String[] args) {
		pets.put(Dog.class.getSimpleName().toLowerCase(), new Dog());
		pets.put(Cat.class.getSimpleName().toLowerCase(), new Cat());
		SpringApplication.run(PetshopApplication.class, args);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/")
	public String listPets() {
		final StringBuffer result = new StringBuffer();

		result.append("<h1> PET STORE </h1>");

		pets.values().forEach(pet -> {
			result.append("<li>"+pet.toString());
		});

		result.append("<p> 총 페이지뷰 : " + HomeAdvice.getPageView());
		return result.toString();
	}

	@RequestMapping(method = RequestMethod.GET, path = "{petId}")
	public String showPet(@PathVariable(value = "petId") String petId) {
		StringBuffer result = new StringBuffer();
		Pet thePet = pets.get(petId);

		result.append("<h1>" + petId + "</h1>");
		result.append("<br>에너지 : " + thePet.getEnergy());

		result.append("<br>1. <a href='" + petId + "/feed'>먹이주기</a>");
		result.append("<br>2. <a href='" + petId + "/sleep'>재우기</a>");
		result.append("<br>3. <a href='" + petId + "/cart'>입양하기</a>");

		if(thePet instanceof Groomable) {
			result.append("<br>4. <a href='" + petId + "/groom'>그루밍하기</a>");
		}
		return result.toString();
	}

	@Autowired
	Cart cart;

	@RequestMapping(method = RequestMethod.GET, path = "{petId}/cart")
	public String addToCart(@PathVariable(value = "petId") String petId) throws Exception {
		Pet thePet = pets.get(petId);

		cart.add(thePet);
		return "성공적으로 입양했습니다.<br>" + cart;
	}

	@RequestMapping(method = RequestMethod.GET, path = "{petId}/feed")
	public String feed(@PathVariable(value = "petId") String petId) throws Exception {
		Pet thePet = pets.get(petId);

		thePet.eat();
		return "맛있는 거 먹었습니다.";
	}

	@RequestMapping(method = RequestMethod.GET, path = "{petId}/sleep")
	public String sleep(@PathVariable(value = "petId") String petId) throws Exception {
		Pet thePet = pets.get(petId);

		thePet.sleep();
		return "잘 잤습니다.";
	}

	@RequestMapping(method = RequestMethod.GET, path = "{petId}/groom")
	public String groom(@PathVariable(value = "petId") String petId) {
		Cat cat = (Cat)pets.get(petId);

		String i = cat.grooming();

		return i;
	}



}
