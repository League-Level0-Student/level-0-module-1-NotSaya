package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import java.util.jar.Attributes.Name;

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String x;
x = "Jamie is very smart";
String y;
y = "Jake is very humorous";
String z;
z = "Julia is very creative";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("Enter a name (Jamie, Jake, or Julia)");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (name.equalsIgnoreCase("Jamie")) {
	JOptionPane.showMessageDialog(null, x);
}
if (name.equalsIgnoreCase("Jake")) {
	JOptionPane.showMessageDialog(null, y);
}
if (name.equalsIgnoreCase("Julia")) {
	JOptionPane.showMessageDialog(null, z);
}
	}
}

