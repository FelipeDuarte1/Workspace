Algoritmo "notas"
var

   nota1, nota2, notaFinal : real
   
inicio

      escreva("Digite a primeira nota: ")
      leia(nota1)
      Escreva("Digite a segunda nota: ")
      leia(nota2)
      
      notaFinal <- nota1 + nota2
      
      escreval("Nota Final = ", notaFinal:5:1)
      
      se notaFinal < 60 entao
         escreval("REPROVADO")
      fimse
      
      
Fimalgoritmo