package br.com.caelum.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class RotaPedidos {

	public static void main(String[] args) throws Exception {

		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				
				from("file:pedidos?delay=5s").
				log("{$id}").
				to("file:saída");
				//Se eu colocar noop=true, ele não vai apagar os arquivos da parta original
			}
		});
		context.start();
		Thread.sleep(20000);
		context.stop();
	}	
}
