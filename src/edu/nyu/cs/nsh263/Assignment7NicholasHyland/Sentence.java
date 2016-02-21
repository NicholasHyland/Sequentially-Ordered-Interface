package edu.nyu.cs.nsh263.Assignment7NicholasHyland;

import java.util.ArrayList;

public class Sentence implements SequentiallyOrdered {

	ArrayList<Word> wordsOfSentence = new ArrayList<Word>();
	
	public Word getWord(int x) {
		if (x >= 0) {
			return wordsOfSentence.get(x);
		}
		else {
			return wordsOfSentence.get(wordsOfSentence.size() - 1);
		}
	}
	
	public Sentence(String sentence) {
		String[] split = sentence.split("\\s+");
		
		for (int i = 0; i < split.length; i++) {
			Word word = new Word(split[i], i);
			wordsOfSentence.add(word);
		}
	}
	
	public String toString() {
		return wordsOfSentence.toString();
	}
	
	public OrderedThing getFirst() {
		OrderedThing thing = new OrderedThing(wordsOfSentence.get(0));
		return thing;
	}

	public OrderedThing getLast() {
		OrderedThing thing = new OrderedThing(wordsOfSentence.get(wordsOfSentence.size() - 1));
		return thing;
	}

	public ArrayList<OrderedThing> getSequence() {
		ArrayList<OrderedThing> sequence = new ArrayList<OrderedThing>();
		
		for (int i = 0; i < wordsOfSentence.size(); i++) {
			OrderedThing thing = new OrderedThing(wordsOfSentence.get(i));
			sequence.add(thing);
		}
		return sequence;
	}

}
