package src.model;
//Classe que esta herdando de contaBancaria 
public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String agencia, String conta, Integer digito, Double saldoInicial) {
        // Aqui por baixo ele cria uma contaBancaria.
        super(agencia, conta, digito, saldoInicial);
       
        
    }
    
}

