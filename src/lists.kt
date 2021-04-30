fun main(){
    println(evenNames(listOf("grace","stella","rose","willy","dennis","monroe","ruth","kendi","amanda","joe")))
    descendingAges()
    println()
    println(Allheights(listOf(30.4,49.0,39.0)))
    person()
    var car= mutableListOf(
        Car("KBY124",750),
        Car("KVN123",600),
        Car("KSSS12",2323),
        Car("KBAD",400)
    )
    println(carMileage(listOf(750,600,2323,400)))

}
fun evenNames(names:List<String>):List<String>{
    var student= mutableListOf<String>()
    names.forEachIndexed{index,character->
        if (index%2==0){
            student.add(character)

        }
    }
    return student

}
data class Person(var name:String,var age:Int,var height:Int,var weight:Double)
fun descendingAges(){
    var allPeople= listOf(
        Person("susan",12,5,45.6),
    Person("roselyn",33,4,65.2),
        Person("cate",18,5,55.6),
        Person("amanda",23,6,65.3)
    )
    var people=allPeople.sortedByDescending { person ->person.age  }
    println(people)

}

fun Allheights(height:List<Double>):Pair<Double,Double>{
    var sum = height.sum()
    var average= height.average()
    return Pair(sum,average)

}
data class People(var name:String,var age:Int,var height:Int,var weight:Double)
fun person() {
    var allPeople = mutableListOf(
        Person("susan", 12, 5, 45.6),
        Person("roselyn", 33, 4, 65.2),
        Person("cate", 18, 5, 55.6),
        Person("amanda", 23, 6, 65.3)
    )
    allPeople.addAll(listOf(
        Person("kyler",34,5,66.0),
    Person("stacy",12,4,36.3)
    )
    )
    println(allPeople)
}
data class Car(var registration:String,var mileage:Int)
    fun carMileage(mileage: List<Int>):Int{
        var m=mileage.average().toInt()
        return m
    }







