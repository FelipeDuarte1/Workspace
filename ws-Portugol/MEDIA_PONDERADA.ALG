Algoritmo "media_ponderada"
var

   N, i : inteiro
   a, b, c, media : real
   
inicio

     escreva("Quantos casos voce vai digitar? ")
     leia(N)
     
     para i de 1 ate N faca
          escreval("Digite tres numeros: ")
          leia(a)
          leia(b)
          leia(c)
          media <- (a * 2 + b * 3 + c * 5) / 10
          escreval("Media = ", media:3:1)
          
     fimpara
     
Fimalgoritmo