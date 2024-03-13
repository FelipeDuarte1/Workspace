Algoritmo "par_impar"
var

   N, x, i : inteiro
   
inicio

      escreva("Quantos numeros voce vai digitar? ")
      leia(N)
      
      para i de 1 ate N faca
           escreva("Digite um numero: ")
           leia(x)
           
           se x = 0 entao
              escreval("Nulo")
           senao
                se x % 2 = 0 entao
                   se x < 0 entao
                      escreval("Par negativo")
                   senao
                        escreval("Par positivo")
                   fimse
                senao
                     se x < 0 entao
                        escreval("Impar negativo")
                     senao
                          escreval("Impar positivo")
                     fimse
                fimse
          fimse
      fimpara
      
Fimalgoritmo
