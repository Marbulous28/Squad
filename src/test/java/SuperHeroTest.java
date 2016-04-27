import org.junit.*;
import static org.junit.Assert.*;

public class SuperHeroTest {

  @Test
  public void Hero_instantiatesCorrectly_true() {
    SuperHero mySuperHero = new SuperHero("Johnson!", 12, "lightning", "mom");
    assertEquals(true, mySuperHero instanceof SuperHero);
  }

  @Test
  public void Hero_instantiatesObjectSuperHero_name() {
    SuperHero mySuperHero = new SuperHero("Johnson!", 12, "lightning", "mom");
    assertEquals("Johnson!", mySuperHero.getName());
  }

}
