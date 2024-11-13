package ejercicio1;

public class Cliente extends Thread {
	private Producto producto;
	private String nombre;

	public void run() {

		cogerProducto();
	}


	public synchronized void cogerProducto() {
		boolean comprado=false;
		int intentos=0;
		while(!comprado && intentos < 10) {
			
			if (producto.getCantidad() <= 0) {
				System.out.println("Producto agotado para "+getNombre());
				intentos++;
			} else {
				producto.setCantidad(producto.getCantidad() - 1);
				System.out.println("El cliente " + getNombre() + " ha cogido un producto, quedan: " + producto.getCantidad());
				comprado=true;
			}
		}

	}

	public Cliente(Producto producto, String nombre) {
		super();
		this.producto = producto;
		this.nombre = nombre;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
