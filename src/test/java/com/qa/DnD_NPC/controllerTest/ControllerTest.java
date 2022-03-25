package com.qa.DnD_NPC.controllerTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.DnD_NPC.model.DndNPC;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Sql(scripts = {"classpath:testdata.sql"}, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles("dev")
@TestInstance(TestInstance.Lifecycle.PER_CLASS) 

public class ControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private ObjectMapper mapper;
	
	DndNPC npc1 = new DndNPC(1, "Testname", "testrace", "testalignment", 24, true);
	DndNPC npc2 = new DndNPC("John", "Gnome", "Lawful evil", 57, false);
	DndNPC npc3 = new DndNPC("Ragnar", "Dwarf", "Chaotic evil", 83, true);
	
	DndNPC npc1Id = new DndNPC(1, "Wesley", "Gnome", "Chaotic good", 102, false);

	@Test
	public void testCreate() throws Exception {
	String bookingJson = mapper.writeValueAsString(npc1);
	RequestBuilder req = post("/createNPC").contentType(MediaType.APPLICATION_JSON).content(bookingJson);
	ResultMatcher checkStatus = status().isCreated();
	ResultMatcher checkBody = content().string("NPC Created");
	mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
	
	@Test
	public void testGet() throws Exception {
		List<DndNPC> all = List.of(npc1);
		String allJson = mapper.writeValueAsString(all);
		RequestBuilder req = get("/getNPC");
		ResultMatcher checkStatus = status().isOk();
		ResultMatcher checkBody = content().json(allJson);
		mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);

	}
	
	@Test
	public void testDeleteID() throws Exception {
		RequestBuilder req = delete("/delete/1");		
		ResultMatcher checkStatus = status().isAccepted();
		ResultMatcher checkBody = content().string("NPC of ID: 1 deleted");
		mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
	
	@Test
	public void testUpdate() throws Exception {

		DndNPC npc = new DndNPC("Dennis", "Human", "Neutral Good", 25, false);
		String npcJson = mapper.writeValueAsString(npc);
		RequestBuilder req = put("/update/1").contentType(MediaType.APPLICATION_JSON).content(npcJson);
		ResultMatcher checkStatus = status().isAccepted();
		ResultMatcher checkBody = content().string("Updated ID: 1");
		mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
	
	@Test
	public void testAge() throws Exception {
		List<DndNPC> all = List.of(npc1);
		String allJson = mapper.writeValueAsString(all);
		RequestBuilder req = get("/getNPC/20");
		ResultMatcher checkStatus = status().isOk();
		ResultMatcher checkBody = content().json(allJson);
		mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
	
	@Test
	public void testrace() throws Exception {
		List<DndNPC> all = List.of(npc1);
		String allJson = mapper.writeValueAsString(all);
		RequestBuilder req = get("/getrace/testrace");
		ResultMatcher checkStatus = status().isOk();
		ResultMatcher checkBody = content().json(allJson);
		mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
}
