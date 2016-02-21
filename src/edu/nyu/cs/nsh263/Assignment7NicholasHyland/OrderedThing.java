package edu.nyu.cs.nsh263.Assignment7NicholasHyland;

public class OrderedThing {
	
	Character character;
	Word word;
	
	OrderedThing(Character character) {
		this.character = character;
	}

	OrderedThing(Word word) {
		this.word = word;
	}
	
	public String toString() {
		if (character == null) {
			return word.toString();
		}
		else {
			return character.toString();
		}
	}
	
}
