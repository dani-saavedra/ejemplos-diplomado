package patrones.creacionales;

public class Main {

  public static void main(String[] args) {
    // El constructor por defecto existe, siempre y cuanod no se haya
    //sobrecargado el constructor.
    Database database = Database.getInstance();
    System.out.println(database);

    Database database2 = Database.getInstance();
    System.out.println(database2);

  }
}
