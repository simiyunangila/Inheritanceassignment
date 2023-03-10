import java.awt.Color
fun main(){
var vehicles= Car("Tesla","model x","Royal blue",4)
    vehicles.carry(2)
    vehicles.carry(5)
    vehicles.identity()
    println( vehicles.calculateParkingFees(8))
 var vehicle2=Bus("Toyota","Nissan","Yellow",14,)
    println(vehicle2.maxTripFare(50.00))
 println(vehicle2.calculateParkingFees(8))
}
 open class common(var make:String,var model:String,var color:String,var capacity:Int){
     //- carry(people: Int) : Prints out “Carrying $people passengers” if the
//    number of people is within its capacity else it prints out “Over capacity
//    by $x people” where x is the number of people exceeding its capacity
//    (3 points)
     fun carry(people:Int) {
         var x=people-capacity
         if (people<=capacity){
             println("Carrying $people passengers.")
         }else{ println("Over capacity by $x people.")
         }
     }
     //- identity() : Prints out the color, make and model in the following
// format e.g: “I am a white subaru legacy” (1 point)
     fun identity(){
         println("I am a $color $make $model .")
     }
     //- calculateParkingFees(hours: Int) : Calculates and returns the
     //parking fees by multiplying the hours by 20 (1 point)
     open fun calculateParkingFees(hours:Int):Int{
         var total=hours*20
         return total
     }
 }
//1. Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
open class Car( make:String, model:String, color:String, capacity:Int )
    :common(make,model,color,capacity){
    }
//2. Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per trip. (2 points)
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus (3 points)
class Bus( make:String, model:String, color:String, capacity:Int)
    :Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        var total=fare*capacity
        return total
    }
    override fun calculateParkingFees(hours:Int):Int {
        var total = hours * capacity
        return total
    }


    }
