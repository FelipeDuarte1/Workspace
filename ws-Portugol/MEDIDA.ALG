Algoritmo "medida"
var

   A, B, C, areaQuadrado, areaTriangulo, areaTrapezio : real
   
inicio

      escreva("Digite a medida A: ")
      leia(A)
      escreva("Digite a medida B: ")
      leia(B)
      escreva("Digite a medida C: ")
      leia(C)
      
      areaQuadrado <- A * A
      areaTriangulo <- A * B / 2
      areaTrapezio <- (A + B) * C / 2
      
      Escreval("Area do quadrado = ", areaQuadrado:6:4)
      Escreval("Area do triangulo = ", areaTriangulo:6:4)
      Escreval("Area do trapezio = ", areaTrapezio:6:4)
Fimalgoritmo