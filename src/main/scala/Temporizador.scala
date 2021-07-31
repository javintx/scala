object Temporizador {
  def unaVezPorSegundo(callback: () => Unit): Unit = {
    while (true) {
      callback();
      Thread sleep 1000
    }
  }

  def tiempoVuela(): Unit = {
    println("El tiempo vuela como una flecha...")
  }

  def main(args: Array[String]): Unit = {
    unaVezPorSegundo(() => println("Tempus fugit"))
  }
}
