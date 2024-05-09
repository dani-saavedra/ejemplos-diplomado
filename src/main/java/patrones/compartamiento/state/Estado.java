package patrones.compartamiento.state;

public interface Estado {


  void siguienteEstado(Pedido pedido);
  String obtenerEstadoActual();
}
//Guardar referencia del siguiente estado?