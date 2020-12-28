object BubbleSort {
  /**
   * 对数组进行冒泡排序
   * 思路：比较两个相邻的元素，将值大的元素交换到右边
   */

  def bubble(arr1: Array[Int]): Unit = {
    //    外层循环，第一轮循环需要从第一个开始，最后一轮循环到倒数第二个的时候截止就可以了length-2
    for (i <- 0 to arr1.length - 2) {
      //      每次循环需要从第一个开始，到倒数第length-1-i结束
      for (j <- 1 to arr1.length - 1 - i) {
        //       比较两个相邻的元素，将值大的元素交换到右边
        if (arr1(j - 1) > arr1(j)) {
          val num = arr1(j - 1)
          arr1(j - 1) = arr1(j)
          arr1(j) = num

        }
      }
      println(arr1.mkString(","))
    }
  }

  def main(args: Array[String]): Unit = {
    //    在定义数组时直接赋值
    val arr1 = Array(1, 23, 2, 5, 6, 0, 1)
    bubble(arr1)
    println(arr1.mkString(","))
  }

}
