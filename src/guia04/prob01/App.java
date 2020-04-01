package guia04.prob01;

public class App {

public static void main(String[] args){

	Punto P1 = new Punto((float)1.0, (float)1.0);
	Punto P2 = new Punto((float)2.0, (float)2.0);
	Recta R1 = new Recta(P1, P2);
	
	System.out.println("Pendiente R1: "+R1.pendiente());
	
	Punto P3 = new Punto((float)3.0, (float)3.0);
	
}
}
