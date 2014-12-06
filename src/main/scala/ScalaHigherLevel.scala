class ScalaHigherLevel {

  def main(args: Array[String]) = {
    val nums = List(1,2,3,4)

    // A few more examples for List class
    nums.exists(_ == 2)        //  true
    nums.find(_ == 2)          //  Some(2)
    nums.indexWhere(_ == 2)    //  1
    nums.reduceLeft(_ + _)     //  10
    nums.foldLeft(100)(_ + _)  //  110
  }

}
