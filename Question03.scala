package HomeWork

object Question03 {
  def member(element:Any , list:List[Any]) : Boolean = {
    if(list.isEmpty) return false
    if(list.head==element) return true;
    else return member(element,list.tail)
  }
  def subList(l1:List[Any],l2:List[Any]) : Boolean ={
    if(l1.isEmpty) return true
    if(l2.isEmpty) return false
    if(!member(l1.head,l2)) return false
    else return subList(l1.tail,l2)
  }

  def main(args: Array[String]): Unit = {
    //println(member(5,List(1,2,3,4,5)))
    println(subList(List(1,1,2),List(1,2,3,4)))
  }
}
