import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BotonFin extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	public BotonFin() {
		super(new FlowLayout());
		JButton fin = new JButton("Finalizar");
		fin.addActionListener(this);
		add(fin, 0);
	}
	@Override
	public void actionPerformed(ActionEvent evento) {
		System.out.println("Terminamos");
	}

}
