var i = -1

var foundIt = false
while (i < args.length && !foundIt) {
    i = i + 1
  if (!args(i).startsWith("-")) {
    if (args(i).endsWith(".scala"))
      foundIt = true
  }
}
println(args(i))

println
def searchFrom(i: Int): Int =
  if (i >= args.length) -1
  else if (args(i).startsWith("-")) searchFrom(i + 1)
  else if (args(i).endsWith(".scala")) i
  else searchFrom(i + 1)

val j = searchFrom(0)
println(args(j))
