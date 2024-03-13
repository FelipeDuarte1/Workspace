Algoritmo "aumento"
var

   salario, porcentagem, aumento, novoSalario : real
   
inicio


      escreva("Digite o salario da pessoa: ")
      leia(salario)
      
      se salario <= 1000 entao
         porcentagem <- 20
      senao
           se salario <= 3000 entao
              porcentagem <- 15
           senao
                se salario <= 8000 entao
                   porcentagem <- 10
                senao
                     porcentagem <- 5
                fimse
           fimse
      fimse
      
      aumento <- salario * porcentagem / 100
      novoSalario <- salario + aumento
      
      escreval("Novo salario = ", novoSalario:4:2)
      escreval("Aumento = ", aumento:4:2)
      escreval("Porcentagem = ", porcentagem, " %")
Fimalgoritmo