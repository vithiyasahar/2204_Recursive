object Q3 extends  App{

  def Sum(m:Int,n:Int=0): Int=m match{
    case 0 =>n
    case x if x>0 => Sum((m-1),(n+m))
  }
  println(Sum(5))

}
