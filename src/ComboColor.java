import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ComboColor extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	private final String[] colores = { "Rojo", "Verde", "Azul", "Amarillo" };
	
	public ComboColor() {
		super(new FlowLayout());
		JComboBox<String> combo = new JComboBox<String>(colores);
		combo.addActionListener(this);
		add(combo, 0);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		@SuppressWarnings("unchecked")
		JComboBox<String> combobox = (JComboBox<String>)evento.getSource();
		String color = (String)combobox.getSelectedItem();
		updateLabel(color);
	}
	
	protected void updateLabel(String cadena) {
		System.out.println(cadena);
	}

}
