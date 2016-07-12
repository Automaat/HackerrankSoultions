package scala

object ListReplication {

  def main(args: Array[String]) {
    println(f(2, List(1, 2)))
  }

  def f(num:Int,arr:List[Int]):List[Int] = {
    arr.flatMap( x => List.fill(num)(x) )
  }
}
