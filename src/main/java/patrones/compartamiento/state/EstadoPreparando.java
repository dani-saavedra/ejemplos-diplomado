package patrones.compartamiento.state;

public class EstadoPreparando implements Estado {

  @Override
  public void siguienteEstado(Pedido pedido) {
    pedido.estado = new EstadoEntregado();
    //Haga la logica para radicar bla bla bla
  }
  @Override
  public String obtenerEstadoActual() {
    return "Preparando";
  }
}
