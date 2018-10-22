val greetStrings = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!"
for (i <- 0 to 2)
  print(greetStrings(i))

println()
greetStrings.update(0, "Bye")
greetStrings.update(1, ", ")
greetStrings.update(2, "world!")
for (i <- 0 to 2)
  print(greetStrings.apply(i))


println()
val greetStrs = Array("H", ", ", "w!")
for (i <- 0 to 2)
  print(greetStrs.apply(i))

