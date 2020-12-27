import scala.io.StdIn

object scala_stdin {
  def main(args: Array[String]): Unit = {
//    scala从键盘输入
    val str = StdIn.readLine("请输入你的名字\n")
    println(str)
  }

}
