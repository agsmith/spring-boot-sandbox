package com.github.agsmith.springBootDemo.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.github.agsmith.springBootDemo.demo.Cat;

@RepositoryRestResource
interface CatRepo extends JpaRepository<Cat, Long> {

}
