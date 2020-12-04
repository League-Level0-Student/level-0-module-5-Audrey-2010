package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obeident_robot {
	static Robot bot = new Robot();

public static void main(String[] args) {
bot.setSpeed(1000);
String color=JOptionPane.showInputDialog("Which color do you want?");{
	if(color.equals("red")) {
		bot.setPenColor(Color.RED);
	}	if(color.equals("blue")) {
		bot.setPenColor(Color.blue);
	}
	if(color.equals("yellow")) {
		bot.setPenColor(Color.yellow);
	}
	if(color.equals("black")) {
		bot.setPenColor(Color.black);
	}
	}		
String shape=JOptionPane.showInputDialog(null,"Which shape do you want?");{
			if(shape.equals("square")) {
				drawSquare();
			}
			if(shape.equals("triangle")) {
				drawTriangle(shape);
			}
			if(shape.equals("circle")) {
				drawCircle();
			}
		}
	
				}


private static void drawTriangle(Object drawCircle) {
	// TODO Auto-generated method stub
for(int i=0; i<3; i++) {
	bot.penDown();
	bot.move(100);
	bot.turn(120);
}
}


private static void drawCircle() {
	// TODO Auto-generated method stub
for(int i=0; i<360; i++)	{
	bot.penDown();
	bot.move(1);
	bot.turn(1);
	
}
}


private static void drawSquare() {
	// TODO Auto-generated method stub
	for(int i=0; i<4; i++) {
	bot.penDown();
	bot.move(100);
	bot.turn(90);
	}}}
	


