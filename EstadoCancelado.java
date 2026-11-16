public class EstadoCancelado implements EstadoPedido {
    @Override
    public void procesar(Pedido pedido) {
        System.out.println("ERROR: No se puede procesar un pedido cancelado");
    }
    @Override 
    public void cancelar(Pedido pedido) {
        System.out.println("ERROR: El pedido ya esta cancelado");
    } 
    @Override 
    public void enviar(Pedido pedido) {
        System.out.println("ERROR: No se puede eviar un pedido cancelado");
    }
    @Override 
    public void entregar(Pedido pedido){
        System.out.println("ERROR: No se puede entregar un pedido no enviado");
    }
}