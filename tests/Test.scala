object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(59, 83, 22, 22, 5)
    assert(Policy.score(signalcase_1) == 99)
    assert(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(62, 85, 11, 7, 7)
    assert(Policy.score(signalcase_2) == 201)
    assert(Policy.classify(signalcase_2) == "accept")
    val signalcase_3 = Signal(85, 102, 13, 10, 6)
    assert(Policy.score(signalcase_3) == 242)
    assert(Policy.classify(signalcase_3) == "accept")
  }
}
