class Referencia[T] {
  private var contenido: T = _

  def set(valor: T): Unit = {
    contenido = valor
  }

  def get: T = contenido
}

object ReferenciaEntero {
  def main(args: Array[String]): Unit = {
    val ref = new Referencia[Int]
    ref.set(13)
    println("La referencia tiene la mitad de " + (ref.get * 2))
  }
}