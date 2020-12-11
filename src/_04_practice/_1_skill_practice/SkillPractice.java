package _04_practice._1_skill_practice;

import javax.swing.JOptionPane;

public class SkillPractice {
		public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		           skills.skill1();
		          // skills.skill2();
		          // skills.skill3();
		           //skills.skill4();
		           //skills.skill5();
		}

		void skill1() {
			String dimes=JOptionPane.showInputDialog(null, "How many dimes do you have?");
			String cents=JOptionPane.showInputDialog(null, "How many cents do you have?");
			int dimesasInt=Integer.parseInt(dimes);
			int centsAsInt=Integer.parseInt(cents);
			
			int centsTen=centsAsInt/10;
			int total=dimesasInt+centsTen;
			JOptionPane.showMessageDialog(null,total);
}}
