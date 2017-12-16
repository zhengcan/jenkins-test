package jenkins;

public class All {
  private Java java;
  private Scala scala;

  public Java getJava() {
    return java;
  }

  public void setJava(Java java) {
    this.java = java;
  }

  public Scala getScala() {
    return scala;
  }

  public void setScala(Scala scala) {
    this.scala = scala;
  }

  @Override
  public String toString() {
    return "All{" +
      "java=" + java +
      ", scala=" + scala +
      '}';
  }
}
