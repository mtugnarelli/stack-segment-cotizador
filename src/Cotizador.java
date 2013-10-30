
/**
 * Clase utilizada para llevar adelante un juego de rol que tiene como objetivo
 * explicar el funcionamiento del stack segment.
 * 
 */
public class Cotizador {

	public double cotizar(int cantidad, double precioUnitario) {
		
		double total = 0;
		double descuento = 0;
		
		if (cantidad > 100) {
			
			descuento += this.calcularDescuentoPorVolumen(cantidad, precioUnitario);
		}
		
		if (precioUnitario >= 1000.0) {
		
			descuento += this.calcularDescuentoPorCompra(cantidad, precioUnitario);
		}
		
		total = this.calcularPrecio(cantidad, precioUnitario) - descuento;
		
		return total;
	}
	
	private double calcularPrecio(int cantidad, double precioUnitario) {
		
		return cantidad * precioUnitario;
	}
	
	private double calcularDescuentoPorVolumen(int cantidad, double precioUnitario) {
		
		cantidad = (int) (cantidad * 0.1);
		
		return this.calcularPrecio(cantidad, precioUnitario);
	}
	
	private double calcularDescuentoPorCompra(int cantidad, double precioUnitario) {

		precioUnitario = precioUnitario * 0.2;
		
		return this.calcularPrecio(cantidad, precioUnitario);
	}
}