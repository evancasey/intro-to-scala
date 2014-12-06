import scala.annotation.tailrec

class ScalaExamples {

  def main(args: Array[String]) = {

    def factorial(n: Int) = {
      (1 to n).foldLeft(1)(_ * _)
    }

    def factorial1(n: Int): Int = {
      if (n == 1) {
        n
      } else {
        n * factorial1(n - 1)
      }
    }

    def factorial2(n: Int) : Int = {
      @tailrec
      def factorialWithAccumulator(accumulator: Int, number: Int) : Int = {
        if (number == 1)
          return accumulator
        else
          factorialWithAccumulator(accumulator * number, number - 1)
      }
      factorialWithAccumulator(1, n)
    }



  }

}
