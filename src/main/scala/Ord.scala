trait Ord {
  def <(that: Any): Boolean

  def <=(that: Any): Boolean = (this < that) || (this == that)

  def >(that: Any): Boolean = !(this <= that)

  def >=(that: Any): Boolean = !(this < that)
}

class Fecha(d: Int, m: Int, a: Int) extends Ord {
  def anno: Int = a

  def mes: Int = m

  def dia: Int = d

  override def toString: String = s"$anno-$mes-$dia"

  override def equals(that: Any): Boolean =
    that.isInstanceOf[Fecha] && {
      val o = that.asInstanceOf[Fecha]
      o.dia == dia && o.mes == mes && o.anno == anno
    }

  def <(that: Any): Boolean = {
    if (!that.isInstanceOf[Fecha])
      sys.error("no se puede comparar" + that + " y una fecha")

    val o = that.asInstanceOf[Fecha]
    (anno < o.anno) ||
      (anno == o.anno && (mes < o.mes ||
        (mes == o.mes && dia < o.dia)))
  }
}