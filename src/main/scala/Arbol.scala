abstract class Arbol

case class Sum(left: Arbol, right: Arbol) extends Arbol

case class Var(operation: String) extends Arbol

case class Const(value: Int) extends Arbol

//type Entorno = String => Int
//
//def eval(a: Arbol, ent: Entorno): Int = a match {
//  case Sum(i, d) => eval(i, ent) + eval(d, ent)
//  case Var(n) => ent(n)
//  case Const(v) => v
//}
//
//def derivada(a: Arbol, v: String): Arbol = a match {
//  case Sum(l, r) => Sum(derivada(l, v), derivada(r, v))
//  case Var(n) if (v == n) => Const(1)
//  case _ => Const(0)
//}


//object Main {
//  def main(args: Array[String]): Unit = {
//    val exp: Arbol = Sum(Sum(Var("x"), Var("x")), Sum(Const(7), Var("y")))
//    val ent: Entorno = {
//      case "x" => 5
//      case "y" => 7
//    }
//    println("Expresión: " + exp)
//    println("Evaluación con x=5, y=7: " + eval(exp, ent))
//    println("Derivada con respecto a x:\n " + derivada(exp, "x"))
//    println("Derivada con respecto a y:\n " + derivada(exp, "y"))
//  }
//}