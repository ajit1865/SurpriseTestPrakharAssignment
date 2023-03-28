case class Num(number: String, isEven: Boolean)

object DifferentOperationOnFilters extends App {
  val obj1 = Num("1", false)
  val obj2 = Num("2", true)
  val obj3 = Num("3", false)
  val obj4 = Num("4", true)
  val obj5 = Num("5", false)
  //passing objects in List
  val list: List[Num] = List(obj1, obj2, obj3, obj4, obj5)
  //using different predefined methods
  println(list.filter(_.isEven))
  println(list.filterNot(_.isEven))
  println(list.partition(_.isEven))
  println("Even : " + list.filter(_.isEven).map(_.number))
  println("Odd : " + list.filterNot(_.isEven).map(_.number))
  println("First Even : " + list.filter(_.isEven).map(_.number).head)
}