Algoritmo "Delta"

var

   Delta, x1, x2 : real
   a, b, c : inteiro
inicio

      a <- 2
      b <- 3
      c <- 4

      delta <- Exp(b, 2.0) - 4.0 * a * c

      x1 <- (-b + RaizQ(delta)) /  (2.0 * a)
      x2 <- (-b - RaizQ(delta)) /  (2.0 * a)

       escreval
       escreval(delta)
       Escreval(x1)
       escreval(x2)
Fimalgoritmo