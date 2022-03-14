package HomeWork

object alternate {
  def alternate(f1:(Int,Int) => Int,f2:(Int,Int)=>Int,list:List[Int]) : Int = {
    alternateMain(f1:(Int,Int) => Int,f2:(Int,Int)=>Int,list:List[Int],0) // add idx parameter
  }
  def alternateMain(f1:(Int,Int) => Int,f2:(Int,Int)=>Int,list:List[Int],idx:Int) : Int ={
    if(list.isEmpty) return 0
    if(list.length==1) return list(0)
    if(idx%2==0){
      return alternateMain(f1,f2,f1(list.head,list.tail.head) :: list.tail.tail,idx+1)
    } else {
      return alternateMain(f1,f2,f2(list.head,list.tail.head) :: list.tail.tail,idx+1)
    }
  }

  def main(args: Array[String]): Unit = {
    var f1:(Int,Int)=>Int = (x,y)=>x+y
    var f2:(Int,Int)=>Int = (x,y)=>x-y
    var listNum = List(1,2,3,4)
    print(alternate(f1,f2,listNum))
  }
}
