package com.qa.DnD_NPC.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.DnD_NPC.Service.ServiceDB;
import com.qa.DnD_NPC.model.DndNPC;

@RestController
public class Controller {
	
	private ServiceDB serviceDB;

	public Controller(ServiceDB serviceDB) {
		super();
		this.serviceDB = serviceDB;
	}
	
	// CRUD - Create, Read, Update, Delete
	
	@PostMapping("/createNPC")
	public ResponseEntity<String> createNPC(@RequestBody DndNPC npc) {
		serviceDB.createNPC(npc);
		return new ResponseEntity<>("NPC Created", HttpStatus.CREATED);
	}
	
	@GetMapping("/getNPC")
	public ResponseEntity<List<DndNPC>> getNPC() {
		List<DndNPC> npclist = serviceDB.getBookings();
		return new ResponseEntity<>(npclist, HttpStatus.OK);
				
	}
	
	// Get by id needed
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updatebyID(@PathVariable("id") int id, @RequestBody DndNPC npc) {
		serviceDB.updatebyID(id, npc);
		String response = "Updated ID: " + id;
		return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteByID(@PathVariable("id") int id) {
		serviceDB.deleteID(id);
		String response = "NPC of ID: " + id + " deleted";
		return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getNPC/{age}")
	public ResponseEntity<List<DndNPC>> getbyAge(@PathVariable("age") int age) {
		List<DndNPC> response = serviceDB.getByAgeGreaterThan(age);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping("/getrace/{race}")
	public ResponseEntity<List<DndNPC>> getByRace(@PathVariable("race") String race) {
		List<DndNPC> response = serviceDB.getByRace(race);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}

