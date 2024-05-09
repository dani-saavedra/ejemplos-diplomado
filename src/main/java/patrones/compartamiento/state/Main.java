package patrones.compartamiento.state;

public class Main {

  public static void main(String[] args) {
    Pedido pedidoDaniel = new Pedido(false);

    System.out.println(pedidoDaniel.estado.obtenerEstadoActual());
    pedidoDaniel.avanzarPedido();
    System.out.println(pedidoDaniel.estado.obtenerEstadoActual());
    pedidoDaniel.avanzarPedido();
    System.out.println(pedidoDaniel.estado.obtenerEstadoActual());
    pedidoDaniel.avanzarPedido();
    System.out.println(pedidoDaniel.estado.obtenerEstadoActual());
  }
}
