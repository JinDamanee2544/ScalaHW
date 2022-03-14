package HomeWork

object turingStep {
  def turingStep(f:Char=>Char,tape:List[Char],n:Int) : List[Char] = {
    if(tape.isEmpty || n==0) return tape
    return List(f(tape.head)) ++ turingStep(f,tape.tail,n-1)
  }

  def main(args: Array[String]): Unit = {
    var tape = List('C','H','A','R')
    def lw(c:Char) : Char = c.toLower
    print(turingStep(lw,tape,0))
  }
}
