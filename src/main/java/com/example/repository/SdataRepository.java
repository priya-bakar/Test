package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Sdata;

@Repository
public interface SdataRepository extends CrudRepository<Sdata, Long> {

}
