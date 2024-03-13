Algoritmo "troco"
var

   preco, dinheiro, troco : real
   quantidade : inteiro
   
inicio

      escreva("Preco unitario do produto: ")
      leia(preco)
      escreva("Quantidade comprada: ")
      leia(quantidade)
      escreva("Dinheiro recebido: ")
      leia(dinheiro)
      
      troco <- dinheiro - (preco * quantidade)
      
      escreval("Troco = ", troco:4:2)
      
      
Fimalgoritmo