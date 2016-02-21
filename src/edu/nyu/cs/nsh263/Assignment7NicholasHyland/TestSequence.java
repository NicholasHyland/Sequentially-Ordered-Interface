package edu.nyu.cs.nsh263.Assignment7NicholasHyland;

public class TestSequence {

	public static void main(String[] args) {
	Sentence sentence = new Sentence("This is a sentence");
	System.out.println(sentence.getSequence());
	System.out.println();
	System.out.println("The first word of my sentence is '" + sentence.getFirst() + "' and the last word is '" + sentence.getLast() + "'.");
	System.out.println();
	System.out.println(sentence.getWord(0).getSequence() + " and " + sentence.getWord(-1).getSequence());
	System.out.println();
	System.out.println("The first character of '" + sentence.getFirst() + "' is '" + sentence.getWord(0).getFirst() + "' and the last character of '" + sentence.getLast() + "' is '" + sentence.getWord(-1).getLast() + "'.");
	System.out.println();
	System.out.println("The position of '" + sentence.getFirst() + "' is " + sentence.getWord(0).getPosition() + " and the position of '" + sentence.getLast() + "' is " + sentence.getWord(-1).getPosition() + ".");
	}
}
