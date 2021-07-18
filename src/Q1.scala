object Q1 extends App {
  def Prime(i: Int): Boolean =
    if (i <= 1)
      false
    else if (i == 2)
      true
    else
      !(2 until i).exists(n => i % n == 0)

  println(Prime(5))
  println(Prime(6))
}
