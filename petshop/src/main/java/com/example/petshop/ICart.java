package com.example.petshop;

public interface ICart {
    Pet add(Pet pet) throws Exception;
    Pet remove(Pet pet) throws Exception;
}
