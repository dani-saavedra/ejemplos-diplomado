package patrones.compartamiento.state;

public class Pedido {

  Estado estado;
  boolean turbo;

  public Pedido(boolean turbo) {
    this.estado = new EstadoRadicado();
    this.turbo = turbo;
  }

  public void avanzarPedido() {
    estado.siguienteEstado(this);
  }
}
