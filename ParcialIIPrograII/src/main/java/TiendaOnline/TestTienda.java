package TiendaOnline;

public class TestTienda {
    public static void main(String[] args) {


        Handler basic = new PedidoEstandar();
        Handler express = new PedidoExpress();

        basic.setNextHandler(express);

        System.out.println("Solicitud: Pedido Estandar");
        basic.handleRequest("Pedido Estandar");
        basic.handleRequest("Solicitud Aceptada");
        basic.handleRequest("Pago Aceptado");

        System.out.println("\nSolicitud: Pedido Express");
        basic.handleRequest("Pedido Express");
        basic.handleRequest("Solicitud Aceptada");
        basic.handleRequest("Pago Aceptado");
    }
}

