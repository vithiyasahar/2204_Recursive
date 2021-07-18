object Q5 {
  def sum(x:Int):Int={
    if(x<=1)
    {
      return 0;
    }
    if(x==2)
    {
      return x;
    }
    else if(x%2==1)
    {
      return sum(x-1)
    }
    else
    {
      return x+sum(x-2);
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter a number:");
    var num= scala.io.StdIn.readInt();
    var s = sum(num);
    if(num%2==0)
    {
      s= s-num;
    }
    print("The sum of even number is:"+ s);
  }




}
