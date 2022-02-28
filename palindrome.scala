package HomeWork

object palindrome {
  def myLength(list:List[Any]) : Int = {
    if(list.isEmpty) return 0
    else 1+myLength(list.tail)
  }
  def myReverse(list:List[Any]): List[Any] ={
    if(list.isEmpty) return List()
    else return myReverse(list.tail) ++ List(list.head)
  }

  def palindrome(list:List[Any]) : Boolean = {
    if(list.isEmpty || myLength(list)==1) return true
    var end = myReverse(list).head
    if(list.head!=end) return false
    var cutting = myReverse(myReverse(list).tail).tail
    return palindrome(cutting)
  }

  def main(args: Array[String]): Unit = {
    println(palindrome(List(1,4,5,5,4,1)))
  }
}
