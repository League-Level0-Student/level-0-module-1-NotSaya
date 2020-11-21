package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String guess1 = JOptionPane.showInputDialog("What is greater than God, more evil than the devil, the poor have it, the rich need it, and if you eat it you'll die?");
String answer1 = "nothing";
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (guess1.equalsIgnoreCase(answer1)) {
	JOptionPane.showMessageDialog(null, "Correct!");
 score = score + 1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Incorrect! The answer was nothing.");
}
		// 6. Add some more riddles
String guess2 = JOptionPane.showInputDialog("Can you write down eight eights so that they add up to 1000?");
String answer2 = "888+88+8+8+8";
if (guess2.equals(answer2)){
	JOptionPane.showMessageDialog(null, "Correct!");
	score = score + 1;
}
else {
	JOptionPane.showMessageDialog(null, "Incorrect, the right answer was 888+88+8+8+8");
}

String guess3 = JOptionPane.showInputDialog("How can you leave a room with 2 legs and come back with 6?");
String answer3 = "Bring a chair";
if (guess3.equalsIgnoreCase(answer3)) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score = score + 1;
}
else {
	JOptionPane.showMessageDialog(null, "Incorrect, the right answer was to bring a chair.");
}


		// 2. Make a pop up to show the score.

JOptionPane.showMessageDialog(null, "Your score was " +score+ "!" );
		
	}
}

