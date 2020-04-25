package com.javatechie.spring.neo4j.api.node;

import java.util.List;


import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lungcancer_symptom {
	public Lungcancer_symptom(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	@Id
	public int cid;
	public String name;
	public List<Lungcancer_symptom> symptom;

}
