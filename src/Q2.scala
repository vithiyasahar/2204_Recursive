object Q2 {

  def prime(x:Int,i:Int=2):Boolean={
    if(x<=2)
    {
      if(x==2)
      {
        return true;
      }
      else {

        return false;
      }
    }
    if(x%2==0)
    {
      return false;
    }
    if(i*i>x)
    {
      return true;
    }
    return prime(x,i+1);

  }
  def main(args: Array[String]): Unit = {
    print("Enter a number:");
    var num = scala.io.StdIn.readInt();

    for(x<-0 to num)
    {
      if(prime(x))
      {
        println(x);
      }
    }

  }


  }






