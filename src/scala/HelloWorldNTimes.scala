object HelloWorldNTimes {


  def main(args: Array[String]): Unit = {
    f(5)
  }

  def f(n: Int): Unit = n match {
    case 1 => println("Hello World")
    case n: Int =>
      println("Hello World")
      f(n - 1)
  }
}
