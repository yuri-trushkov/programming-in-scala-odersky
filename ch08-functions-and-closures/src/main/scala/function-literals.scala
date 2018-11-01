
val someNumbers = List(-11, -10, -5, 0, 5, 10)

println(someNumbers)

println(someNumbers.filter((x: Int) => x > 0))
println(someNumbers.filter(x => x > 0))
println(someNumbers.filter(_ > 0))

val f = (_: Int) / (_: Int)

println(f(4, 2))
