package com.qa.DnD_NPC.Service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.DnD_NPC.model.DndNPC;
import com.qa.DnD_NPC.repo.Repo;

@Service
public class ServiceDB {
	
	private Repo repo;

	public ServiceDB(Repo repo) {
		super();
		this.repo = repo;
	}
	
	
	// CRUD - Create, Read, Update, Delete
	
	public boolean createNPC(DndNPC npc) {
		repo.save(npc);
		return true;
	}
	
	public DndNPC readbyID(int id) {
	return repo.findById(id).get();
	}
	
	public List<DndNPC> getBookings() {
		return repo.findAll();

	}
	
	public boolean updatebyID(int id, DndNPC npc) {
		DndNPC old = readbyID(id);
		old.setName(npc.getName());
		old.setRace(npc.getRace());
		old.setAlignment(npc.getAlignment());
		old.setAge(npc.getAge());
		old.setIn_use(npc.isIn_use());
		DndNPC update = old;
		repo.save(update);
		return true;
	}
	
	public boolean deleteID(int id) {
		repo.deleteById(id);
		return true;
	}
	
	public boolean deleteall() {
		repo.deleteAll();
		return true;
	}

	public List<DndNPC> getByAgeGreaterThan(int age) {
		return repo.findDndNPCByAgeGreaterThan(age);
	}
	
}
