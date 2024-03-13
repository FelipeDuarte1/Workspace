Algoritmo "media_idade"
var

   idade, soma, cont : inteiro
   media : real
   
inicio

      soma <- 0
      soma <- 0
      
      escreval("Digite as idades: ")
      leia(idade)
      
      enquanto idade >= 0 faca
      
               soma <- soma + idade
               cont <- cont + 1
               
               leia(idade)
      fimenquanto
      
      se cont = 0 entao
         escreval("Impossivel calcular")
      senao
           media <- soma / cont
           escreval("Media = ", media:4:2)
      fimse
      
Fimalgoritmo