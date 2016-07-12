package scala

object FilterArray {

  def main(args: Array[String]) {
    println(f(3, List(1, 2, 10, 3, 0)))

    def a(x: Int): Boolean = x < 3
    println(myFilter(a , List(1, 2, 10, 3, 0), List.empty))
  }

  def f(delim: Int, arr: List[Int]): List[Int] = {
    arr.filter(x => x < delim)
  }

  def myFilter( condition: Int => Boolean, list: List[Int], result: List[Int]): List[Int] = list match{
    case Nil => result
    case x :: tail => if (condition(x)) myFilter(condition, tail, result :+ x) else myFilter(condition, tail, result)
  }

}
