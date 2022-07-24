package Mathematics

object Factorial {
  def factorial(n: Int): Long = get(Int.int2long(n))

  def get(n: Long): Long = if (n < 0) sys.error("n should not be negative")
  else if (n <= 1) 1
  else get(n - 1) * n

}
