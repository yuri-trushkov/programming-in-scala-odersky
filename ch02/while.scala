var i = 0

while (i < args.length) {
  println(args(i))
  i += 1
}

i = 0
while (i < args.length) {
  if (i != 0) 
    print(" ")
  print(args(i))
  i += 1
}
