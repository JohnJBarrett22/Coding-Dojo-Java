package com.johnbarrett.dojosandninjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.johnbarrett.dojosandninjas.models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long> {

}
