 import javax.swing.*;

 	public class BasicElements{
 		public static void main(String[]args){
 			JFrame myFrame = new JFrame();
 			JButton myButton = new JButton();
 			myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
 			myFrame.setVisible(true);
 			myFrame.setSize(900,600);
 			myFrame.add(myButton);
 			myButton.setSize(100,100);
 			myFrame.setLayout(null);

 			System.out.println("Basic Java Elements");


 		}
 	}