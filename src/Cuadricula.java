import java.awt.*;
import javax.swing.*;

/**
 * 
 * 
 * @author Ernesto Echeverría González
 * @version 1.0.0
 * @sincer 04-10-2017
 */
public class Cuadricula extends JPanel {
	private int minSpacing;
	private final int tam = 7;
	private static final long serialVersionUID = 1L;

	public Cuadricula() {
		super();
		setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		setSize(100, 100);
	}
	
	public void paintComponent(Graphics g) {
		int vSpacing = (int)(getSize().getHeight()) / tam;
		int wSpacing = (int)(getSize().getWidth()) / tam;
		if(vSpacing > wSpacing) minSpacing = wSpacing;
		else minSpacing = vSpacing;
		// Dibujamos las líneas verticales
		for(int i = 0; i < getSize().getWidth(); i += minSpacing) {
			g.drawLine(i, 0, i, (int)getSize().getHeight());
		}
		// Dibujamos las líneas horizontales
		for(int i = 0; i < getSize().getHeight(); i += minSpacing) {
			g.drawLine(0, i, (int)getSize().getWidth(), i);
		}
		// Test
		Memoria datos = new Memoria();
		datos.add(new Punto(1, 2));
		datos.add(new Punto(2, 2));
		datos.add(new Punto(2, 3));
		datos.add(new Punto(3, 3));
		datos.add(new Punto(4, 3));
		datos.add(new Punto(5, 3));
		datos.add(new Punto(5, 2));
		datos.drawMemoria(g, minSpacing, tam);
	}
	
	public void paintLine(Graphics g, int x, int y, int width, int height) {
		g.drawLine(x * minSpacing, y * minSpacing, width * minSpacing, height * minSpacing);
	}
	

}
