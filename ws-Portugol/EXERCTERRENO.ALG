Algoritmo "ExercTerreno"
var

   largura, comprimento, metroQuadrado, area, preco : real
   
inicio

      Escreva("Digite a largura do terreno: ")
      leia(largura)
      Escreva("Digite o comprimento do terreno: ")
      leia(comprimento)
      Escreva("Digite o valor do metro quadrado: ")
      leia(metroQuadrado)
      
      area <- largura * comprimento
      preco <- area * metroQuadrado
      
      Escreval("Area do terreno = ", area:8:2)
      Escreval("Preco do terreno = ", preco:8:2)
      
Fimalgoritmo