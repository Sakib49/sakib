package com.javatechie.spring.neo4j.api.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.javatechie.spring.neo4j.api.node.Lungcancer_symptom;


public interface Symptomrepository extends Neo4jRepository<Lungcancer_symptom, Integer> {

}
