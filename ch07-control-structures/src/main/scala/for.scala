val filesHere = (new java.io.File(".")).listFiles

for (file <- filesHere) 
  println(file)
  
println
for (i <- 1 to 4) 
  println("Iteration " + i)

println  
for (i <- 1 until 4) 
  println("Iteration " + i)
