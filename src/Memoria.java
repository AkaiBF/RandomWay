import java.awt.*;
import java.util.ArrayList;

/**
 * 
 * @author Ernesto Echeverría González
 * @version 0.0.0
 * @since 04-10-2017
 */
public class Memoria {
	private ArrayList<Punto> lista;
	
	public Memoria() {
		this.lista = new ArrayList<Punto>();
	}
	
	public boolean exist(Punto punto) {
		for(Punto i: lista) 
			if(punto == i) return true;
		return false;
	}
	
	public void add (Punto punto) {
		lista.add(punto);
	}
	public ArrayList<Punto> getLista() {
		return lista;
	}
	public void drawMemoria(Graphics g, int spacing, int size) {
		for(int i = 1; i < lista.size(); i++) {
			int x1 = lista.get(i - 1).getxAxis();
			int y1 = lista.get(i - 1).getyAxis();
			int x2 = lista.get(i).getxAxis();
			int y2 = lista.get(i).getyAxis();
			g.setColor(Color.RED);
			g.drawLine(x1 * spacing, y1 * spacing, x2 * spacing, y2 * spacing);
		}
		
	}
}
