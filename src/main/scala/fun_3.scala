object fun_3 {
  /**
   * 高阶函数，函数的参数是函数
   */
  def main(args: Array[String]): Unit = {
    println(calc(4, 5, multiply))

  }

  def calc(a: Int, b: Int, operate: (Int, Int) => Int): Int = {
    operate(a, b)
  }

  def multiply(a: Int, b: Int): Int = {
    a * b
  }

  /**
   * 匿名函数，没有名字的函数就是匿名函数，可以直接通过函数字面量（Lamda表达式）来设置匿名函数
   */

  //  (x:Int,y:Int)=>x+y 这就是函数字面量
  //  f1是函数名
  //  (Int, Int) => Int 函数的类型
  val f1: (Int, Int) => Int = (x: Int, y: Int) => x + y


}
