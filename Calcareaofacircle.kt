fun main(){
    println("CALCULATES THE AREA OF A CIRCLE")

    print("Enter radius: ")
    val radius = readln().toDouble()

    val area: Double =  kotlin.math.PI * radius * radius
    val approximatedArea = String.format("%.2f", area)
    println("The area of a circle of radius $radius is $area")
    println("Which is approximated to $approximatedArea")




}
