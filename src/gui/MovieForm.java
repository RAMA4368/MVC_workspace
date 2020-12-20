package gui;

import java.awt.Choice;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import blood.model.BloodAdvisor;
import movie.model.MovieAdvisor;

public class MovieForm extends JFrame{
	Choice ch;
	JButton bt;
	MovieAdvisor advisor = new MovieAdvisor();
	
	public MovieForm() {
		ch = new Choice();
		bt = new JButton("����");
		
		//add blood type
		ch.add("�ż���");
		ch.add("���ϵ�");
		ch.add("���˵���");
		ch.add("�ٸ��ǿ������ϼҼ�");
		
		ch.setPreferredSize(new Dimension(120, 30));
		setLayout(new FlowLayout());
		add(ch);
		add(bt);
		
		bt.addActionListener((e)->{
			showResult();
		});
		
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void showResult(){
		String msg = advisor.getAdvice(ch.getSelectedItem());
		JOptionPane.showMessageDialog(this, msg);
	}
	public static void main(String[] args) {
		new MovieForm();
	}

}
