

def f(): Int = try return 1 finally return 2

def g(): Int = try return 1 finally 2

def h(): Int = try 1 finally 2


println(f())
println(g())
println(h())
