Algoritmo "pares_consecutivos"
var

   X, soma : inteiro
   
inicio

    escreva("Digite um numero inteiro: ")
    leia(X)
    
    enquanto X <> 0 faca
    
             se X % 2 <> 0 entao
                X <- X + 1
             fimse
             
             soma <- 5 * X + 20
             escreval("Soma = ", soma)
             
             escreva("Digite um numero inteiro: ")
             leia(X)
    fimenquanto
Fimalgoritmo