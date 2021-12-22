// 13주 차 Chapter. 2

package com.example.petshop;

import com.example.petshop.domain.*;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String>{    // Repository Pattern Interface
  
}
