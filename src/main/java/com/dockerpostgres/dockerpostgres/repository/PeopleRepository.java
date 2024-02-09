package com.dockerpostgres.dockerpostgres.repository;

import com.dockerpostgres.dockerpostgres.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<People,Integer> {
}
