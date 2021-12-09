// restful api 란 Chapter .3, Chapter .4

package com.example.petshop;

import org.springframework.data.repository.CrudRepository;

public interface CatRepository extends CrudRepository<Cat, Long>{    // Repository Pattern Interface
  
}
