package edu.nyu.cs.nsh263.Assignment7NicholasHyland;

import java.util.ArrayList;

public interface SequentiallyOrdered {

		public OrderedThing getFirst();
		public OrderedThing getLast();
		public ArrayList<OrderedThing> getSequence();

	}

