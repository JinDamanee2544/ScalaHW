package HomeWork

object Question04 {
  def merge(l1:List[Int],l2:List[Int]) : List[Int] = {
    if(l1.isEmpty) return l2
    if(l2.isEmpty) return l1
    if(l1.head<l2.head){
      return List(l1.head) ++ merge(l1.tail,l2)
    } else {
      return List(l2.head) ++ merge(l1,l2.tail)
    }
  }

  def myMergeSort(list:List[Int],left:Int,right:Int) : List[Int] = {
    if(left==right) return List(list(left))
    var middle = (left+right)>>1
    var leftArr = myMergeSort(list,left,middle)
    var rightArr = myMergeSort(list,middle+1,right)
    return merge(leftArr,rightArr)
  }
  def mergeSort(list:List[Int]) : List[Int] = {
    myMergeSort(list,0,list.length-1)
  }
  def main(args: Array[String]): Unit = {
    println(mergeSort(List(4,1,3,9,5,10,5,6,60)))
  }
}
