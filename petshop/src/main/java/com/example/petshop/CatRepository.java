// restful api 란 Chapter .3

package com.example.petshop;

import org.springframework.data.repository.CrudRepository;

public interface CatRepository extends CrudRepository<Cat, Long>{
    
}
