object Q6
{
  def fibonacci(n:Int):Int= {
    if ( n == 0 )
    {
      return 0;
    }

    else if ( n == 1 )
    {
      return 1;
    }
    else
      return ( fibonacci(n-1) + fibonacci(n-2) );
  }
  def main(args: Array[String]): Unit = {
    print("Enter a number:");
    var num = scala.io.StdIn.readInt();
    for(x <- 0 to num-1)
    {
      print(fibonacci(x)+ " ");
    }
    fibonacci(num-2);
  }
}
