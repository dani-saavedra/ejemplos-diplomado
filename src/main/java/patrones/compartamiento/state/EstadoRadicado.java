package patrones.compartamiento.state;

public class EstadoRadicado implements Estado {

  @Override
  public void siguienteEstado(Pedido pedido) {
    if (pedido.turbo) {
      pedido.estado = new EstadoPreparando();
    } else {
      pedido.estado = new EstadoEsperando();
    }
    //Haga la logica para radicar bla bla bla
  }

  @Override
  public String obtenerEstadoActual() {
    return "Radicado";
  }
}
