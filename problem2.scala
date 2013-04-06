def fibLimit(f0:Int, f1:Int, limit:Int): List[Int] = {
  val f2 = f0 + f1
  if (f2 > limit) Nil
  else f2 :: fibLimit(f1, f2, limit)
}
def fib(limit:Int): List[Int] = 1 :: 2 :: fibLimit(1, 2, limit)
println(fib(4000000).filter(_ % 2 == 0).sum)
