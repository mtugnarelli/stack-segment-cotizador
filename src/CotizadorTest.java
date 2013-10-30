import org.junit.Assert;
import org.junit.Test;

public class CotizadorTest {

	@Test
	public void cotizarSinDescuento() {

		Cotizador cotizador = new Cotizador();
		
		double precio = cotizador.cotizar(10, 20.0);
		
		Assert.assertEquals(200.0, precio, 0.01);
	}
	
	@Test
	public void cotizarConDescuentos() {
		
		Cotizador cotizador = new Cotizador();
		
		double precio = cotizador.cotizar(200, 1000.0);

		Assert.assertEquals(140000.0, precio, 0.01);
	}
}