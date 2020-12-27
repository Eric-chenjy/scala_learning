object printf_test {
  def main(args: Array[String]): Unit = {
    val a=10
    val b=1.1
    val c="this is a test"
    printf("a的值是%d，b的值是%.1f，c的值是 %s\n",a,b,c)
//    s插值
    printf(s"a=$a,b=$b\n")
//    原始插值
    printf(raw"\n\n\n\n")
//    多行字符串
    val s=
      """
        |hfodahfoidshfoisdhfid
        |sfldgjdfgjdfojgdfio
        |dflgkflkjf
        |lskfdjgkfjfogif
        |lksdjlfjdfijdio;;;;;  dlfdfj
        |""".stripMargin
//    多行字符串插值
    val sql=
      s"""
        |select * from tableA
        |where user_name = '$c';
        |""".stripMargin
    println(s) 
    println(sql)
  }

}
