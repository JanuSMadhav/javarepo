package Inheritance;

import newpackage.MultipleInheritance1;

public class MultipleInChild implements MultipleInheritance1, MultipleInheritance2{
	public void display() {
		System.out.println("Display an example");
	}
	public void color() {
		System.out.println("Color is blue");
	}

	public static void main(String[] args) {
		MultipleInChild mn = new MultipleInChild(); 
			mn.display();
			mn.color();
		}

	}
