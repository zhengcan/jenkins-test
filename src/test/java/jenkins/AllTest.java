package jenkins;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllTest {

  @Test
  public void testToString() {
    All all = new All();
    all.setJava(new Java());
    all.setScala(new Scala());
    System.out.println(all);
    assertEquals("All{java=Java, scala=Scala(Java)}", all.toString());
  }

}