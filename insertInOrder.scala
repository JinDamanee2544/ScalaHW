package HomeWork

object insertInOrder {
  def insertInOrder(x:Int , list:List[Int]) : List[Int] = {
    if(list.isEmpty) return List(x)
    if(list.head<x){
      return List(list.head) ++ insertInOrder(x,list.tail)
    } else {
      return List(x) ++ list
    }
  }

  def main(args: Array[String]): Unit = {
    println(insertInOrder(10,List(1,2,5,6,8,9)))
  }
}
