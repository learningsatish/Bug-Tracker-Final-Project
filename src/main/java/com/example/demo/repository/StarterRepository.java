package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.Starter;


public interface StarterRepository extends CrudRepository<Starter, Integer> {

}