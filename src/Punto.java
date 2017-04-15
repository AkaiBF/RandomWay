
/**
 * 
 * @author Ernesto Echeverría González
 * @version 1.0.0
 * @since 04-10-2017
 */
public class Punto {
	private int xAxis;
	private int yAxis;
	
	public Punto() {
		xAxis = 0;
		yAxis = 0;
	}
	public Punto(int xAxis, int yAxis) {
		this.xAxis = xAxis;
		this.yAxis = yAxis;
	}
	public int getxAxis() {
		return xAxis;
	}
	public void setxAxis(int xAxis) {
		this.xAxis = xAxis;
	}
	public int getyAxis() {
		return yAxis;
	}
	public void setyAxis(int yAxis) {
		this.yAxis = yAxis;
	}
}
