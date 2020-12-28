/**
 * 测试函数
 */
object fun_1 {
  def main(args: Array[String]): Unit = {
    println(function_1(1, 2))
    function_2(10)
  }
//  参数类型和返回值类型的定义都是：XX
  def function_1(x :Int,y :Int):Int={
    x+y
  }
//  没有返回值，返回值类型可以先不写，自动推导就行
  def function_2(x:Int)={
    println(x)

  }

}
