package HomeWork

object myMap {
  def myMap(f:Int => Int) (list:List[Int]) : List[Int] = {
    if(list.isEmpty) return List()
    return List(f(list.head)) ++ myMap(f)(list.tail)
  }

  def main(args: Array[String]): Unit = {
    var listOfNumber = List(0,1,2,3,4,5)
    print(myMap(x=>x*2)(listOfNumber))
  }
}
