package com.qa.DnD_NPC.modelTest;




import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.qa.DnD_NPC.model.DndNPC;

public class ModelTest {
	
	@Test
	public void equalTest() {
		
		DndNPC x = new DndNPC(1, "Testname", "testrace", "testalignment", 24, true);
		DndNPC y = new DndNPC(1, "Testname", "testrace", "testalignment", 24, true);
	    Assertions.assertTrue(x.equals(y) && y.equals(x));
	    Assertions.assertTrue(x.hashCode() == y.hashCode());
	    
	    }
	
}
