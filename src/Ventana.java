import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public Ventana() {
		
		setSize(600, 300);
		setLayout(new GridLayout(1, 2));
		add(new Cuadricula());
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout());
		container.add(new Menu());
		add(container);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ventana();
		
	}
}
