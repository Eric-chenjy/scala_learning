object for_1 {
  /**
   * for推导式
   */
  def main(args: Array[String]): Unit = {
    for {i <- 1 to 100;
         j <- i+1 to 100} {
      println(s"i=$i,j=$j")
    }
  }

}
