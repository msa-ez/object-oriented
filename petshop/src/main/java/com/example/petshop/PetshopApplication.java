//중간점검 Chpater .1, Repository Pattern 의 직접 구현
/*
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

		if(thePet==null) return null;

        result.append("<h1>" + petId + "</h1>");
        result.append("<br>에너지 : " + thePet.getEnergy());                      

        result.append("<li><a href='" + petId + "/feed'>먹이주기</a>");
        result.append("<li><a href='" + petId + "/sleep'>재우기</a>");
        result.append("<li><a href='" + petId + "/cart'>입양하기</a>");

        if(thePet instanceof Groomable) {
            result.append("<li><a href='" + petId + "/groom'>그루밍하기</a>");
        }
        return result.toString();
    }

    @Autowired
    ICart cart;

    @RequestMapping(method = RequestMethod.GET, path = "{petId}/cart")
    public String addToCart(@PathVariable(value = "petId") String petId) throws Exception {
        Pet thePet = pets.get(petId);

        cart.add(thePet); // Separation of Concerns. Dependency Inversion Principle. // Ubiqutous Language.

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
*/


// Repository Pattern 의 직접 구현 Chpater .2
/*
package com.example.petshop;

import java.util.HashMap;
import java.util.List;

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

		if(thePet==null) return null;

        result.append("<h1>" + petId + "</h1>");
        result.append("<br>에너지 : " + thePet.getEnergy());                      

        result.append("<li><a href='" + petId + "/feed'>먹이주기</a>");
        result.append("<li><a href='" + petId + "/sleep'>재우기</a>");
        result.append("<li><a href='" + petId + "/cart'>입양하기</a>");

        if(thePet instanceof Groomable) {
            result.append("<li><a href='" + petId + "/groom'>그루밍하기</a>");
        }
        return result.toString();
    }

    @Autowired
    PetRepository cart;

    @RequestMapping(method = RequestMethod.GET, path = "{petId}/cart")
    public String addToCart(@PathVariable(value = "petId") String petId) throws Exception {
        Pet thePet = pets.get(petId);

        cart.save(thePet); // Separation of Concerns. Dependency Inversion Principle. // Ubiqutous Language.

        List<Pet> result = cart.findAll();
        StringBuffer buffer = new StringBuffer();

        result.forEach(pet -> {
            buffer.append("<li>" + pet.getClass().getSimpleName());
        });
        return "성공적으로 입양했습니다.<br>" + buffer.toString();
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
*/



// JPA 를 기반한 Repository pattern 구현체 자동생성
// Chpater .1
/*
package com.example.petshop;

import java.util.HashMap;
import java.util.List;

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
	static String[] names = {
        "젤리",
        "대박이",
        "감자",
        "사랑",
        "자몽이",
        "꼬맹이",
        "몽이",
        "모리",
        "하리",
        "해피",
        "하트",
        "콩",
        "태양",
    };

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

		if(thePet==null) return null;

		result.append("<h1>" + petId + "</h1>");
		result.append("<br>에너지 : " + thePet.getEnergy());                      

		result.append("<li><a href='" + petId + "/feed'>먹이주기</a>");
		result.append("<li><a href='" + petId + "/sleep'>재우기</a>");
		result.append("<li><a href='" + petId + "/cart'>입양하기</a>");

		if(thePet instanceof Groomable) {
			result.append("<li><a href='" + petId + "/groom'>그루밍하기</a>");
		}
		return result.toString();
	}

	@Autowired
	PetRepository cart;

	@RequestMapping(method = RequestMethod.GET, path = "{petId}/cart")
	public String addToCart(@PathVariable(value = "petId") String petId) throws Exception {
		Pet thePet = pets.get(petId);
		thePet = thePet.getClass().newInstance();
		thePet.setName(names[(int) Math.round(Math.random() * names.length - 1)]);

		cart.save(thePet); // Separation of Concerns. Dependency Inversion Principle. // Ubiqutous Language.

		Iterable<Pet> result = cart.findAll();
		StringBuffer buffer = new StringBuffer();

		result.forEach(pet -> {
			buffer.append("<li>" +pet.getId() + ". " + pet.getClass().getSimpleName() + "" + pet.getName() + "</li>");
		});
		return "성공적으로 입양했습니다.<br>" + buffer.toString();
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
*/


// restful api 란 Chapter .1
/*
package com.example.petshop;

import java.util.HashMap;
import java.util.List;

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
	static String[] names = {
        "젤리",
        "대박이",
        "감자",
        "사랑",
        "자몽이",
        "꼬맹이",
        "몽이",
        "모리",
        "하리",
        "해피",
        "하트",
        "콩",
        "태양",
    };

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

		if(thePet==null) return null;

		result.append("{");
		result.append("'petId': '"+petId+"', ");
		result.append("'energy' : " + thePet.getEnergy());
		result.append("}");               

		// result.append("_links':'" + petId + "/feed'>먹이주기</a>");
		// result.append("<li><a href='" + petId + "/sleep'>재우기</a>");
		// result.append("<li><a href='" + petId + "/cart'>입양하기</a>");

		// if(thePet instanceof Groomable) {
		// 	result.append("<li><a href='" + petId + "/groom'>그루밍하기</a>");
		// }
		return result.toString();
	}

	@Autowired
	PetRepository cart;

	@RequestMapping(method = RequestMethod.GET, path = "{petId}/cart")
	public String addToCart(@PathVariable(value = "petId") String petId) throws Exception {
		Pet thePet = pets.get(petId);
		thePet = thePet.getClass().newInstance();
		thePet.setName(names[(int) Math.round(Math.random() * names.length - 1)]);

		cart.save(thePet); // Separation of Concerns. Dependency Inversion Principle. // Ubiqutous Language.

		Iterable<Pet> result = cart.findAll();
		StringBuffer buffer = new StringBuffer();

		result.forEach(pet -> {
			buffer.append("<li>" +pet.getId() + ". " + pet.getClass().getSimpleName() + "" + pet.getName() + "</li>");
		});
		return "성공적으로 입양했습니다.<br>" + buffer.toString();
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
*/


// Chapter .2, Chapter .3
/*
package com.example.petshop;

import java.util.HashMap;
import java.util.List;

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
@EnableAspectJAutoProxy

public class PetshopApplication {

	static HashMap<String, Pet> pets = new HashMap<String, Pet>();
	static String[] names = {
        "젤리",
        "대박이",
        "감자",
        "사랑",
        "자몽이",
        "꼬맹이",
        "몽이",
        "모리",
        "하리",
        "해피",
        "하트",
        "콩",
        "태양",
    };

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

		if(thePet==null) return null;

		result.append("{");
		result.append("'petId': '"+petId+"', ");
		result.append("'energy' : " + thePet.getEnergy());
		result.append("}");               

		// result.append("_links':'" + petId + "/feed'>먹이주기</a>");
		// result.append("<li><a href='" + petId + "/sleep'>재우기</a>");
		// result.append("<li><a href='" + petId + "/cart'>입양하기</a>");

		// if(thePet instanceof Groomable) {
		// 	result.append("<li><a href='" + petId + "/groom'>그루밍하기</a>");
		// }
		return result.toString();
	}

	@Autowired
	PetRepository cart;

	@RequestMapping(method = RequestMethod.GET, path = "{petId}/cart")
	public String addToCart(@PathVariable(value = "petId") String petId) throws Exception {
		Pet thePet = pets.get(petId);
		thePet = thePet.getClass().newInstance();
		thePet.setName(names[(int) Math.round(Math.random() * names.length - 1)]);

		cart.save(thePet); // Separation of Concerns. Dependency Inversion Principle. // Ubiqutous Language.

		Iterable<Pet> result = cart.findAll();
		StringBuffer buffer = new StringBuffer();

		result.forEach(pet -> {
			buffer.append("<li>" +pet.getId() + ". " + pet.getClass().getSimpleName() + "" + pet.getName() + "</li>");
		});
		return "성공적으로 입양했습니다.<br>" + buffer.toString();
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
*/



// Chapter .4
/*
package com.example.petshop;

import java.util.HashMap;
import java.util.List;

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
@RestController
@EnableAspectJAutoProxy

public class PetshopApplication {

	//static HashMap<String, Pet> pets = new HashMap<String, Pet>();
	static String[] names = {"젤리","대박이","감자","사랑","자몽이","꼬맹이","몽이","모리","하리","해피","하트","콩","태양"};

	public static void main(String[] args) {
		// pets.put(Dog.class.getSimpleName().toLowerCase(), new Dog());
		// pets.put(Cat.class.getSimpleName().toLowerCase(), new Cat());

		SpringApplication.run(PetshopApplication.class, args);
	}

	@Autowired
	PetRepository petRepository;

	@RequestMapping(method = RequestMethod.GET, path="pets/{petId}/feed")
	public String feed(@PathVariable(value = "petId") Long petId) {

		Pet thePet = petRepository.findById(petId).get();

		thePet.eat();

		petRepository.save(thePet);

		return "맛있는 거 먹었습니다.";
	}


	@RequestMapping(method = RequestMethod.GET, path="pets/{petId}/groom")
	public String groom(@PathVariable(value = "petId") Long petId) {
		Pet thePet = petRepository.findById(petId).get();

		if(thePet instanceof Groomable) {
			String message = ((Groomable)thePet).grooming();
			petRepository.save(thePet);
			return message;
		}
		return "그루밍이 불가능한 Pet 입니다.";
	}
}
*/



// Chapter .5, Chapter .6
/*
package com.example.petshop;

import java.util.HashMap;
import java.util.List;

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
@RestController
@EnableAspectJAutoProxy

public class PetshopApplication {

	//static HashMap<String, Pet> pets = new HashMap<String, Pet>();
	static String[] names = {"젤리","대박이","감자","사랑","자몽이","꼬맹이","몽이","모리","하리","해피","하트","콩","태양"};

	public static void main(String[] args) {
		// pets.put(Dog.class.getSimpleName().toLowerCase(), new Dog());
		// pets.put(Cat.class.getSimpleName().toLowerCase(), new Cat());

		SpringApplication.run(PetshopApplication.class, args);
	}

	@Autowired
	PetRepository petRepository;

	@RequestMapping(method = RequestMethod.PUT, path="pets/{petId}/feed")
	public String feed(@PathVariable(value = "petId") Long petId) {

		Pet thePet = petRepository.findById(petId).get();

		thePet.eat();

		petRepository.save(thePet);

		return "맛있는 거 먹었습니다.";
	}


	@RequestMapping(method = RequestMethod.PUT, path="pets/{petId}/groom")
	public String groom(@PathVariable(value = "petId") Long petId) {
		Pet thePet = petRepository.findById(petId).get();

		if(thePet instanceof Groomable) {
			String message = ((Groomable)thePet).grooming();
			petRepository.save(thePet);
			return message;
		}
		return "그루밍이 불가능한 Pet 입니다.";
	}
}
*/



// Chapter .7
package com.example.petshop;

import java.util.HashMap;
import java.util.List;

import javax.management.StringValueExp;

import com.example.petshop.domain.Pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableAspectJAutoProxy

public class PetshopApplication {

	//static HashMap<String, Pet> pets = new HashMap<String, Pet>();
	static String[] names = {"젤리","대박이","감자","사랑","자몽이","꼬맹이","몽이","모리","하리","해피","하트","콩","태양"};

	public static void main(String[] args) {
		// pets.put(Dog.class.getSimpleName().toLowerCase(), new Dog());
		// pets.put(Cat.class.getSimpleName().toLowerCase(), new Cat());

		SpringApplication.run(PetshopApplication.class, args);
	}

	@Autowired
	PetRepository petRepository;

	@RequestMapping(method = RequestMethod.PUT, path="pets/{petId}/feed")
	public String feedPet(@PathVariable(value = "petId") Long petId) {

		Pet thePet = petRepository.findById(petId).get();

		thePet.eat();

		petRepository.save(thePet);

		return "맛있는 거 먹었습니다.";
	}


	@RequestMapping(method = RequestMethod.PUT, path="pets/{petId}/groom")
	public String groomPet(@PathVariable(value = "petId") Long petId) {
		Pet thePet = petRepository.findById(petId).get();

		if(thePet instanceof Groomable) {
			String message = ((Groomable)thePet).grooming();
			petRepository.save(thePet);
			return message;
		}
		return "그루밍이 불가능한 Pet 입니다.";
	}
	@RequestMapping(method = RequestMethod.PUT, path="cats/{petId}/groom")
	public String groom(@PathVariable(value = "petId") Long petId) {
		return groomPet(petId);
	}
	@RequestMapping(method = RequestMethod.PUT, path="cats/{petId}/feed")
	public String feedCat(@PathVariable(value = "petId") Long petId) {
		return feedPet(petId);
	}
	@RequestMapping(method = RequestMethod.PUT, path="dogs/{petId}/feed")
	public String feedDog(@PathVariable(value = "petId") Long petId) {
		return feedPet(petId);
	}
}

