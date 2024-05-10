package patrones.creacionales.singleton;

public class Database {

  private static Database instance;

  //OCP Java 17
  private Database() {
  }

  public static Database getInstance() {
    if (instance == null) {
      instance = new Database();
    }
    return instance;
  }

}
