package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;

public class Test {

	public static void main(String[] args) {
		Organizer organizer = new Organizer();
		organizer.id = 1231;
		organizer.name = "Apple Inc";
		
		System.out.println(organizer);
		System.out.println(organizer.name);
		
		Event event = new Event();
		event.id = 4561;
		event.Name = "IPhone 100 launch";
		event.description = "Grand launch";
		
		System.out.println(event.description);

	}

}
