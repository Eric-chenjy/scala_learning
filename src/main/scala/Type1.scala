import org.omg.CORBA.Any

import scala.collection.immutable.StringOps

object Type1 {
  def main(args: Array[String]): Unit = {
//    数据类型都是大写
    val num1=1.1

    //    Unit 对应java中的void,一般用于函数或者方法没有返回值的情况
    val a: Unit = 0
    println(a)
//StringOps 是String的加强版
    val str: StringOps ="fjfhfhj";
//    Null数据类型只有null一个值，只能赋值给任何引用类型
    val null1 =null
//    Nothing是所有类型的子类型，象征意义，用于辅助类型推导，一般用于非正常结束情况下的返回值，比如抛出异常

//    强制类型转换
      println("124".toInt)
  }

}
