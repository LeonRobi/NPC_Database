package com.qa.DnD_NPC.servicesTest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.qa.DnD_NPC.Service.ServiceDB;
import com.qa.DnD_NPC.model.DndNPC;
import com.qa.DnD_NPC.repo.Repo;

@SpringBootTest
public class ServiceTest {

	@MockBean
	private Repo repo;
	
	@Autowired
	private ServiceDB service;
	
	
	DndNPC npc1 = new DndNPC("Testname", "testrace", "testalignment", 24, true);
	DndNPC npc2 = new DndNPC("John", "Gnome", "Lawful evil", 57, false);
	DndNPC npc3 = new DndNPC("Ragnar", "Dwarf", "Chaotic evil", 83, true);
	
	DndNPC npc1Id = new DndNPC(1, "Wesley", "Gnome", "Chaotic good", 102, false);

	@Test
	public void testCreate() {
		Mockito.when(repo.save(npc1)).thenReturn(npc1Id);
		boolean result = service.createNPC(npc1);
		Assertions.assertTrue(result);
		
	}
	
	@Test
	public void testgetbyID() {
		Mockito.when(repo.findById((int) 1)).thenReturn(Optional.of(npc1Id));
		DndNPC result = service.readbyID(1);
		Assertions.assertEquals(npc1Id, result);
	}
	
	@Test
	public void testUpdate() {
		Mockito.when(repo.findById((int) 1)).thenReturn(Optional.of(npc1Id));
		DndNPC result = service.readbyID(1);
		result.setName("Donut");
		repo.save(result);
		DndNPC updatedResult = service.readbyID(1);
		Assertions.assertEquals(updatedResult, result);
		//Mockito.verify(repo, Mockito.never()).flush();

	}
	
	@Test
	public void testdeleteID() {
//		Mockito.when(repo.deleteById((int) 1)).thenReturn(Optional.of(npc1Id));
//		boolean result = service.deleteID(1);
//		Assertions.assertTrue(result);
		int id = 1;
		assertThat(service.deleteID(id)).isTrue();
		Mockito.verify(repo, Mockito.times(1)).deleteById(id);
	}
	
}
