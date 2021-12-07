// Repository Pattern 의 직접 구현 Chpater .2
/*
package com.example.petshop;

import java.util.List;

public interface PetRepository {
    Pet save(Pet pet) throws Exception; // CREATE
    Pet delete(Pet pet) throws Exception; // DELETE
    List<Pet> findAll() throws Exception; // READ
    Pet upadte(Pet pet) throws Exception; // UPDATE
}
*/


// JPA 를 기반한 Repository pattern 구현체 자동생성
// Chpater .1
package com.example.petshop;

import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> { // Repository Pattern Interface
    
}