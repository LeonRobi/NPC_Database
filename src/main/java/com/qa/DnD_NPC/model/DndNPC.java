package com.qa.DnD_NPC.model;

import java.util.Objects;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class DndNPC {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, length = 30)
	private String name;
	@Column(nullable = false, length = 40)
	private String race;
	@Column(nullable = false, length = 20)
	private String Alignment;
	@Column(nullable = false)
	private int age;
	@Column(nullable = false)
	private boolean in_use;
	
	
	public DndNPC() {
		super();
	}

	public DndNPC(int id, String name, String race, String alignment, int age, boolean in_use) {
		super();
		this.id = id;
		this.name = name;
		this.race = race;
		Alignment = alignment;
		this.age = age;
		this.in_use = in_use;
	}

	public DndNPC(String name, String race, String alignment, int age, boolean in_use) {
		super();
		this.name = name;
		this.race = race;
		Alignment = alignment;
		this.age = age;
		this.in_use = in_use;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getAlignment() {
		return Alignment;
	}

	public void setAlignment(String alignment) {
		Alignment = alignment;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isIn_use() {
		return in_use;
	}

	public void setIn_use(boolean in_use) {
		this.in_use = in_use;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Alignment, age, id, in_use, name, race);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DndNPC other = (DndNPC) obj;
		return Objects.equals(Alignment, other.Alignment) && age == other.age && id == other.id
				&& in_use == other.in_use && Objects.equals(name, other.name) && Objects.equals(race, other.race);
	}

	@Override
	public String toString() {
		return "DndNPC [id=" + id + ", name=" + name + ", race=" + race + ", Alignment=" + Alignment + ", age=" + age
				+ ", in_use=" + in_use + "]";
	}
	
	// hashcode and equals testing GOOOGLE
	

}
