// restful api 란 Chapter .3, Chapter .4, Chapter .5, Chapter .6, Chapter .7

package com.example.petshop;

import com.example.petshop.domain.Dog;

import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long>{
    
}
