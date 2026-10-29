import java.io.FileInputStream;
import java.util.Scanner;
import javax.swing.JLabel;
import java.io.FileNotFoundException;
import javax.swing.JFrame;
import java.awt.GridLayout;

class Lab10_Test{
	Lab10_Test(){
		String s;
		String arr[];
		JFrame fr=new JFrame();
		fr.setSize(400,400);
		fr.setTitle("TABLE CONTENTTS");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout g=new GridLayout(4,3);
		fr.setLayout(g);
		try{
		FileInputStream fin=new FileInputStream("table.txt");
		Scanner sc=new Scanner(fin);
		while(sc.hasNextLine()){
		s=sc.nextLine();
		arr=s.split(",");
		for(String i: arr){
			JLabel l=new JLabel(i);
			fr.add(l);
		}
		}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		fr.setVisible(true);
		
	}
	public static void main(String[] args){
		new Lab10_Test();
	}
}