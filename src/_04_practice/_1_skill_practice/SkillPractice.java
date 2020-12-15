package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
		public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		           skills.skill1();
		          skills.skill2();
		          skills.skill3();
		           skills.skill4();
		           skills.skill5();
		}

		void skill1() {
			String dimes=JOptionPane.showInputDialog(null, "How many dimes do you have?");
			String cents=JOptionPane.showInputDialog(null, "How many cents do you have?");
			int dimesasInt=Integer.parseInt(dimes);
			int centsAsInt=Integer.parseInt(cents);
			
			int centsTen=centsAsInt/10;
			int total=dimesasInt+centsTen;
			JOptionPane.showMessageDialog(null,"You have "+total+" dimes in total!");


		String inchesTall=JOptionPane.showInputDialog(null,"How tall are you (in inches)?");
		int intInchesTall = Integer.parseInt(inchesTall);
		
				if(intInchesTall<=36){
			JOptionPane.showMessageDialog(null,"Eat your wheaties");
		}}
		void skill2() {
			for(int i=0; i<31; i++) {
				if( i % 3 ==0) {
					System.out.print(i+" ");}}	
		}
		void skill3() {
			
				System.out.println();
					Random random = new Random();
					int randomMaker = random.nextInt(20);
					System.out.print(randomMaker);
					System.out.print(" minus ");
					int randomMaker2 = random.nextInt(10);
					System.out.print(randomMaker2);
					int total=randomMaker-randomMaker2;
					System.out.print(" is "+total);
					System.out.println();
					}
						
					
				
		void skill4() {
		String home=JOptionPane.showInputDialog("Where do you live?");
			if(home.equalsIgnoreCase("San Diego")) {
				JOptionPane.showMessageDialog(null, "You live in America's finest city!");
			}
			else {
			JOptionPane.showMessageDialog(null, "You should move to San Diego.");
			}
			}
		void skill5() {
			String school=JOptionPane.showInputDialog("What school do you go to?");
				JOptionPane.showMessageDialog(null, "Wow! "+school+" is a great school!");
			
		}
		}
		
			
		

