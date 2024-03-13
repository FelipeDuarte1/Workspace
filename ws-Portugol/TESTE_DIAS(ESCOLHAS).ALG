Algoritmo "Teste_dias(escolhas)"
var

    x : inteiro
    dia : caractere
    
inicio

      leia(x)
      
      escolha x
      caso 1
           dia <- "domingo"
      caso 2
           dia <- "segunda"
      caso 3
           dia <- "terça"
      caso 4
           dia <- "quarta"
      caso 5
           dia <- "quinta"
      caso 6
           dia <- "sexta"
      caso 7
           dia <- "sabado"
      outrocaso
               dia <- "valor invalido"
      fimescolha
      
      escreval("Dia da semana = ", dia)

Fimalgoritmo