package guia04.prob01;

public class Punto {

	private float x;
	private float y;
	
	public Punto(){}
	
	public Punto(float x, float y){
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	@Override
	public boolean equals(Object otroPunto){
		Punto otro = (Punto) otroPunto;
		if(this==otro && otro!=null)
			if(otro.x==this.x && otro.y==this.y)
				return true;
		return false;
	}
}
