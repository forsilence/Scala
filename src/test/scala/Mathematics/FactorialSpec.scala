package Mathematics

import org.scalatest.flatspec.AnyFlatSpec

class FactorialSpec extends AnyFlatSpec {

  it should "out put n's factorial" in {
    assert(Factorial.factorial(1) === 1)
    assert(Factorial.factorial(0) === 1)
    assert(Factorial.factorial(2) === 1 * 2)
    assert(Factorial.factorial(10) === 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10)
  }

}
