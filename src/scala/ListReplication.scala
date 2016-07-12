package scala

object ListReplication {

  def main(args: Array[String]) {
    val res = f(2, List(1, 2))
    println(res)
  }

  def f(num:Int,arr:List[Int]):List[Int] = {
    arr.flatMap( x => List.fill(num)(x) )
  }
}
