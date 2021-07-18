object Q4 extends App
{

  println("Enter Number:")
  val a = scala.io.StdIn.readInt()
  if(isEven(a)){println("Even")}else {println("not even")}
  if(isOdd(a)){println("Odd")}else {println("not odd")}


  def isEven(n:Int):Boolean = n match{
    case 0 => true
    case _ => isOdd(n-1)
  }

  def isOdd(n:Int) : Boolean = !(isEven(n))
}
