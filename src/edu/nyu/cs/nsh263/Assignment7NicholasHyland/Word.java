package edu.nyu.cs.nsh263.Assignment7NicholasHyland;

import java.util.ArrayList;

public class Word implements SequentiallyOrdered {

	ArrayList<Character> characterSequence = new ArrayList<Character>();
	int wordPosition;
	
	public Word(String word, int position) {
		wordPosition = position;
		for (int i = 0; i < word.length(); i++) {
			characterSequence.add(word.charAt(i));
		}
	}
	
	public String toString() {
		String myString = "";
		for (int y = 0; y < characterSequence.size(); y++) {
			myString += characterSequence.get(y);
		}
		return myString;
	}
	
	public OrderedThing getFirst() {
		OrderedThing thing = new OrderedThing(characterSequence.get(0));
		return thing;
	}

	public OrderedThing getLast() {
		OrderedThing thing = new OrderedThing(characterSequence.get(characterSequence.size() - 1));
		return thing;
	}

	public ArrayList<OrderedThing> getSequence() {
		ArrayList<OrderedThing> sequence = new ArrayList<OrderedThing>();
		
		for (int i = 0; i < characterSequence.size(); i++) {
			OrderedThing thing = new OrderedThing(characterSequence.get(i));
			sequence.add(thing);
		}
		return sequence;
	}
	
	public int getPosition() {
		return wordPosition;
	}

}
