package guia04.prob01;

public class Recta {
	
	private Punto p1, p2;
//	private Punto p2;
	
	public Recta(){
		Punto p1 = new Punto((float)0.0, (float)0.0);
		Punto p2 = new Punto((float)0.0, (float)0.0);
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Recta(Punto p1, Punto p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public float pendiente(){
		Punto p1;
		Punto p2;
		p1 = this.p1;
		p2 = this.p2;
		
		return((p2.getY()-p1.getY())/(p2.getX()-p1.getX()));
	}
	
	public boolean paralelas(Recta otraRecta){
		Recta other = (Recta) otraRecta;
		return (this.pendiente() == other.pendiente());
	}
	
	public boolean equals(Object otraRecta){
		Recta other = (Recta) otraRecta;
		Punto p1 = this.p1;
		Punto p2 = other.p2;
		Recta r3 = new Recta(p1, p2);
		
		if(other instanceof Recta){
			if(this.pendiente() == r3.pendiente())
				return true;
		}
		return false;
	}
}
