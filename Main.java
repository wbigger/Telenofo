import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class Main {

  @Test
  public void testTelefonoFisso(){
    Telefono t = new TelefonoFisso(0.15/60);
    assertEquals(3.0,t.costoTelefonata(1200),0.0);
  }

  @Test
  public void testTelefonoCellulareBrowser(){
    TelefonoCellulare t = new TelefonoCellulare(0.35/60);
    t.browse();
    t.costoTelefonata(1200);

  }
  
  @Test
  public void testTelefonoCellulare(){
    Telefono t = new TelefonoCellulare(0.35/60);
    assertEquals(7.12,t.costoTelefonata(1200),0.01);
  }

  public static void main(String[] args) {
    JUnitCore.main("Main");
  }
}
// hello there
// hakuna matata 🌮
