package HomeWork

object myFilter {
  def myFilter(f:Int => Boolean) (list:List[Int]) : List[Int] = {
    if(list.isEmpty) return List()
    if(f(list.head)) return List(list.head) ++ myFilter(f)(list.tail)
    else return myFilter(f)(list.tail)
  }

  def main(args: Array[String]): Unit = {
    var listOfNum = List(0,1,2,3,4,5)
    var emptylist = List();
    //print(myFilter(x=>x%2==0)(emptylist))
    print(myFilter(x=>x<3)(listOfNum))
  }
}
