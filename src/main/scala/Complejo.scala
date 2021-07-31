class Complejo(real: Double, imaginaria: Double) {
  def re: Double = real

  def im: Double = imaginaria

  override def toString: String =
    "" + re + (if (im < 0) "" else "+") + im + "i"
}

object Main {
  def main(args: Array[String]): Unit = {
    def complex = new Complejo(1.5, 2.3)

    println(complex)
  }
}