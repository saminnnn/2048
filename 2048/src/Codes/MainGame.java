package Codes;
import javax.swing.*;

public class MainGame extends JPanel{

	
	public static void main(String[] args) {
		JFrame window=new JFrame();
		window.setBounds(10, 10, 500, 640);
		window.setTitle("2048");
		window.getContentPane().add(new gameBoard());
		window.revalidate();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		//gameBoard game=new gameBoard();
		//game.paint();
	}

}
