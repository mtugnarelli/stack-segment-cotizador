
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
			descuento += calcularDescuentoPorVolumen(cantidad, precioUnitario);
		}
		
		if (precioUnitario >= 1000.0) {
			descuento += calcularDescuentoPorCompra(cantidad, precioUnitario);
		}
		
		total = calcularPrecio(cantidad, precioUnitario) - descuento;
		return total;
	}
	
	private double calcularPrecio(int cantidad, double precioUnitario) {
		
		return cantidad * precioUnitario;
	}
	
	private double calcularDescuentoPorVolumen(int cantidad, double precioUnitario) {
		
		cantidad = (int) (cantidad * 0.1);
		double descuento = calcularPrecio(cantidad, precioUnitario); 
		return descuento;
	}
	
	private double calcularDescuentoPorCompra(int cantidad, double precioUnitario) {

		precioUnitario = precioUnitario * 0.2;
		double descuento = calcularPrecio(cantidad, precioUnitario); 
		return descuento;
	}
}