package patrones.compartamiento.state;

public class EstadoEsperando implements Estado {

  @Override
  public void siguienteEstado(Pedido pedido) {
    pedido.estado = new EstadoPreparando();
    //Haga la logica para Preparar bla bla bla
  }
  @Override
  public String obtenerEstadoActual() {
    return "Esperando";
  }
}
