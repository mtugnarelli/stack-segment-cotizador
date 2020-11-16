import org.junit.Assert;
import org.junit.Test;

public class CotizadorTest {

	@Test
	public void cotizarSinDescuento() {

		Cotizador cotizador = new Cotizador();
		int cantidad = 10;
		double precioUnitario = 20.0;
		
		double precio = cotizador.cotizar(cantidad, precioUnitario);
		
		Assert.assertEquals(200.0, precio, 0.01);
	}
	
	@Test
	public void cotizarConDescuentos() {
		
		Cotizador cotizador = new Cotizador();
		int cantidad = 200;
		double precioUnitario = 1000.0;
		
		double precio = cotizador.cotizar(cantidad, precioUnitario);

		Assert.assertEquals(140000.0, precio, 0.01);
	}
}