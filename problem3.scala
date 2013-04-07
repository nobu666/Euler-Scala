def maxFactor(n:BigInt, factor:BigInt = 2):BigInt = {
  if (n < factor * factor) n
  else if (n % factor == 0) maxFactor(n / factor, factor)
  else maxFactor(n, factor + 1)
}
println(maxFactor(BigInt("600851475143")))
