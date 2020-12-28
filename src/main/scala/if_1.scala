import scala.io.StdIn

object if_1 {
  def main(args: Array[String]): Unit = {
    val num1 = 123
    val result = if (num1 > 100 && num1 < 120) {
      println(s"$num1 大于100")
    } else if (num1 > 120) {
      printf("%d大于120\n", num1)
    }
    //    返回的是Unit，也就是void () ，原因是printf函数的返回值就是Unit
    println(result)
    println(if (1 == 1) {
      "测试if返回值是不是最后一行"
    })
    //    如果逻辑代码只有一个那么{}可以省略
    if (1 == 1) println("恭喜你")
    test()
  }
  def test()={
    val str = StdIn.readLine("输入1就正确")
    if (str.toInt==1){
      println("正确")
    }else{
      println("错误")
    }
  }
}
