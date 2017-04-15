import java.awt.*;

import javax.swing.*;

public class Menu extends JPanel {

	private static final long serialVersionUID = 1L;
	public Menu() {
		super();
		
		setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		setLayout(new GridLayout(4, 1));
		add(new BotonInicio());
		add(new BotonFin());
		add(new ComboColor());
		add(new TextFieldSize());
	}
}
