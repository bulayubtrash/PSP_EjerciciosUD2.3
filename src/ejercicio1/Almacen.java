package ejercicio1;

public class Almacen {
	public static void main(String[] args) {
		Cliente c;
		Producto p1= new Producto(100);
		String nombre;
		for (int i = 0; i < 300; i++) {
			nombre="Cliente"+i;
			c=new Cliente(p1,nombre);
			c.start();
		}
	}

}
