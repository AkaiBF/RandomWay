import java.awt.event.*;
import javax.swing.*;

public class TextFieldSize extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	public TextFieldSize() {
		super();
		JTextField campo = new JTextField(10);
		campo.addActionListener(this);
		add(campo);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JTextField texto = (JTextField)e.getSource();
		System.out.println(texto.getText());
		
	}

}
