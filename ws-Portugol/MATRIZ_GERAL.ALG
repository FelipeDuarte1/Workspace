Algoritmo "matriz_geral"
var

   N, i,j, linha, coluna : inteiro
   soma: real
   mat : vetor[0..9,0..9] de real
inicio

      escreva("Qual a ordem da matriz?")
      leia(N)
      
      para i de 0 ate N-1 faca
           para j de 0 ate N-1 faca
                escreva("Elemento [", i, ",", j, "]: ")
                leia(mat[i,j])
           fimpara
      fimpara
      
      soma <- 0
      para i de 0 ate N-1 faca
           para j de 0 ate N-1 faca
                se mat[i,j] > 0 entao
                   soma <- soma + mat[i,j]
                fimse
           fimpara
      fimpara

      escreval
      escreval("Soma dos positivos: ", soma:3:1)

      escreval
      escreval("Escolha uma linha: ")
      leia(linha)
      escreva("Linha escolhida: ")
      para j de 0 ate N-1 faca
           escreva(mat[linha,j]:3:1, " ")
      fimpara
      escreval

      escreval
      escreval("Escolha uma coluna: ")
      leia(coluna)
      escreva("Coluna escolhida:")
      para i de 0 ate N-1 faca
           escreva(mat[i,coluna]:3:1, " ")
      fimpara
      escreval
      
      escreval
      escreva("Diagonal principal:")
      para i de 0 ate N-1 faca
           escreva(mat[i,i]:3:1, " ")
      fimpara
      escreval
      
      para i de 0 ate N-1 faca
           para j de 0 ate N-1 faca
                se mat[i,j] < 0 entao
                   mat[i,j] <- Exp(mat[i,j], 2)
                fimse
           fimpara
           escreval
      fimpara
      
           
           


Fimalgoritmo