package scala_practise_package

object Lecture_20250219 {

  def main(args:Array[String]):Unit=
    {
      var a: Double = 3
      println(a)

      if (a>20)
        {
          print("Success")
        }
      else
        {
          print("Error")
        }

      for(i<-100 to 1 by -5)
        {
          println(i)
        }

      var num = 1
      for (i<-1 to 5 by 1)
        {
          for (j <- 1 to i by 1)
            {
              print(num)
              print(" ")
              num = num + 1
            }
          println()
        }

        for (i<-1 to 5 by 1)
          {
            for (j <- 1 to i by 1)
              {
                print(j)
                print(" ")
              }
            println()
          }

          for (i<-1 to 5 by 1)
            {
              for (j <- 1 to i by 1)
                {
                  print(i+" ")
                }
              println()
            }

    }
}
