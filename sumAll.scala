package HomeWork

object sumAll {
  def sumEachPair(list1:List[Int],list2:List[Int]) : List[Int] = {
    if(list1.isEmpty && list2.isEmpty) return List()
    if(list1.isEmpty) return list2
    if(list2.isEmpty) return list1
    return List(list1.head+list2.head) ++ sumEachPair(list1.tail,list2.tail)
  }
  def sumAll(lists:List[List[Int]]) : List[Int] = {
    if(lists.isEmpty) return List()
    if(lists.length==1) return lists.head
    // sum consecutive list
    return sumAll(List(sumEachPair(lists.head,lists.tail.head)) ++ lists.tail.tail) // sum first two and concat with the remains
  }

  def main(args: Array[String]): Unit = {
    println(sumAll(List()))
    println(sumAll(List(List())))
    println(sumAll(List(List(1,2,3,4),List(),List(4,5),List(1,2,3,4,5,6))))
    println(sumAll(List(List(3,4),List(1,2,3,4,5,6),List(1,2,3,4))))
    println(sumAll(List(List(1,2,3,4,5,6),List(1,2,3,4),List(1,2),List(0,0,0,0,0,0,0,0,9))))
  }
}
