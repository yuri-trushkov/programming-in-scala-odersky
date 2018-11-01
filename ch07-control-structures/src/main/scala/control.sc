val args = Array("a")

val filename =
  if (! args.isEmpty) args(0)
  else "default.txt"



def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

def gcd(x: Long, y: Long): Long =
  if (y == 0) x else gcd(y, x % y)


gcdLoop(120, 25)

()
def greet() = { println("hi") }
() == greet()