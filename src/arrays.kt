import java.util.*

fun main(){
 names()
    world()
    number()
   var names = arrayOf("Sandra","Kendi","Mamo")
    println(Arrays.toString(names))

}
fun names(){
    var name=arrayOf("Wato","Kenya","Lion","Sabdio")
    println(Arrays.toString(name))
}
fun world(){
    var cities=arrayOf("harare","mumbai","dodoma","jarkata")
    for(city in cities){
     println(city.capitalize())
    }
}
fun number(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var total=numbers[1].plus(numbers[4])
    println(total)
    println(numbers.indexOf(158))
    var sortednumbers=numbers.sortedArray()
    println(Arrays.toString(sortednumbers))
}
fun name(a:String,b:String,c:String):Array<String>{
    var names=arrayOf(a,b,c)
    return names
}
