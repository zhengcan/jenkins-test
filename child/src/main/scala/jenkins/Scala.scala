package jenkins

class Scala {
  override def toString(): String = {
    val java = new Java
    return s"Scala($java)"
  }
}
