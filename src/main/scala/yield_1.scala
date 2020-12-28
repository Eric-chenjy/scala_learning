object yield_1 {
  def main(args: Array[String]): Unit = {
    val ints = for (i <- 1 to 100) yield {
      i * 2
    }
    println(ints)
  }
}
