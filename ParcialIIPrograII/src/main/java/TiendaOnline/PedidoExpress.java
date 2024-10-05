package TiendaOnline;



class PedidoExpress extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("Pedido Express")) {
            System.out.println("Pedido Urgente: Procesando la solicitud.");
            verificarPedido();
        } else if (request.equals("Solicitud Aceptada")) {
            System.out.println("Pedido Urgente: Solicitud Aceptada.");
            verificarPago();
        } else if (request.equals("Pago Aceptado")) {
            System.out.println("Pedido Urgente: Pago Aceptado. Envío en proceso.");
            enviarPedido();
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    private void verificarPedido() {
        System.out.println("Pedido Urgente: Verificación del pedido en curso.");
    }

    private void verificarPago() {
        System.out.println("Pedido Urgente: Verificación del pago en curso.");
    }

    private void enviarPedido() {
        System.out.println("Pedido Urgente: Envío exitoso.");
    }
}
