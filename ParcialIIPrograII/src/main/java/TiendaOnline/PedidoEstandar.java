package TiendaOnline;



class PedidoEstandar extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("Pedido Estandar")) {
            System.out.println("Pedido Estandar: Procesando la solicitud.");
            verificarPedido();
        } else if (request.equals("Solicitud Aceptada")) {
            System.out.println("Pedido Estandar: Solicitud Aceptada.");
            verificarPago();
        } else if (request.equals("Pago Aceptado")) {
            System.out.println("Pedido Estandar: Pago Aceptado. Preparando el paquete.");
            prepararPaquete();
            System.out.println("Pedido Estandar: Paquete preparado. Envío en proceso.");
            enviarPedido();
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    private void verificarPedido() {
        System.out.println("Pedido Estandar: Verificación del pedido en curso.");
    }

    private void verificarPago() {
        System.out.println("Pedido Estandar: Verificación del pago en curso.");
    }

    private void prepararPaquete() {
        System.out.println("Pedido Estandar: Preparación del paquete en curso.");
    }

    private void enviarPedido() {
        System.out.println("Pedido Estandar: Envío exitoso.");
    }
}
