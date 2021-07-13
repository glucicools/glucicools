
fun inlove ( timmy : Int , sarah : Int ): Boolean{
    if((timmy %2 == 0).xor(sarah%2 == 0)) return true
    return false

}

fun main (){
 println(inlove(22,11))

}