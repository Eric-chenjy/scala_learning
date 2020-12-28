object fun_2 {
  def main(args: Array[String]): Unit = {
    val arr1 = Array(1, 23, 2, 5, 6, 0, 1)

    /**
     * 函数返回值类型:有return 语句的时候,必须手动填写返回值类型
     */
    def function_1(): String = {
      "this is a function with return"
    }

    println(function_1())

    /**
     * 如果函数体只有一行代码，可以省略花括号
     */
    def function_2(a: Int, b: Int) =
      a + b
    def function_3(a: Int, b: Int) = a + b

    println(function_2(2, 3))
    println(function_3(3, 3))

    /**
     * 如果函数没有参数列表，那么小括号可以省略,调用时小括号必须省略
     */
    def function_4="this is a function with no argument"

    println(function_4)
  }

  /**
   * scala如果想要自动推断无返回值,可以省略等号
   * // 将无返回值的函数称之为过程
   */

  def function_5(){
     "this is a function with no =the return can be automatic deduction"
  }

  println(function_5())
  /**
   * 如果不关心名称，只关系逻辑处理，那么函数名（def）可以省略
   */
  val f: String => String = (x:String)=>{"wusong"+x}

  // 万物皆函数 : 变量也可以是函数
  println(f("ximenqing"))
  private val multi2: Int => Int = (x: Int) => {
    2 * x
  }
  println("52行"+multi2(2))
}
