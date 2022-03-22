package com.qa.DnD_NPC.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.DnD_NPC.model.DndNPC;



public interface Repo extends JpaRepository<DndNPC, Integer>{
	
	
//	public List<DndNPC> findByAlignment(String alignment);
//	
	public List<DndNPC> findDndNPCByAgeGreaterThan(int age);

}
