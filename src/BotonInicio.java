import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BotonInicio extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	public BotonInicio() {
		super(new FlowLayout());
		JButton inicio = new JButton("Comenzar");
		inicio.addActionListener(this);
		add(inicio, 0);
	}
	@Override
	public void actionPerformed(ActionEvent evento) {
		System.out.println("Empezamos");
	}
}
