package com.johnbarrett.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.johnbarrett.dojooverflow.models.Tag;

@Repository
public interface TagRepo extends CrudRepository <Tag, Long> {

}
