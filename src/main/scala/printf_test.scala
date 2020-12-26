object printf_test {
  def main(args: Array[String]): Unit = {
    val a=10
    val b=1.1
    val c="this is a test"
    printf("a的值是%d，b的值是%.1f，c的值是 %s",a,b,c)
//    printf("a的值是 %d",a)
  }

}
