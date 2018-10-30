import scala.collection.mutable

val tresureMap = mutable.Map[Int, String]()

tresureMap += (1 -> "Go to island.")
tresureMap += (2 -> "Find big X on ground.")
tresureMap += (3 -> "Dig.")

println(tresureMap(2))




val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")
println(romanNumeral(4))
