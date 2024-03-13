package src.model;

import java.util.Date;
import java.util.InputMismatchException;
//Essa classe serve somente para ser herança, e não ser instanciada;
//Isso seria apenas um modelo, template;
//Abstract serve para isso, não poder instanciar e apenas usar de modelo
public abstract class  ContaBancaria {
    
    //#region Atributos
    private String agencia;

    private String conta;
    
    private Integer digito;

    private Double saldo;

    private java.util.Date dataAbertura;

    private Double VALOR_MINIMO_DEPOSITO = 10.0;
    //#endregion
    
    //#region Construtores
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();
    }   
    //#endregion

    //#region Getters e Setters

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }

    public java.util.Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(java.util.Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    //#endregion

    //#region metodos

    public void depositar(double valor){
        if(valor < VALOR_MINIMO_DEPOSITO){
            throw new InputMismatchException("O valor minimo de deposito é R$" + VALOR_MINIMO_DEPOSITO);
        }
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
    }

    public Double sacar(Double valor){
        if(valor > this.saldo){
            throw new InputMismatchException("O saldo é insuficiente");
        }
        //this.saldo = this.saldo - valor;
        this.saldo -= valor;

        //retorn o valor sacado ao usuario
        return valor;
    }

    public void transferir(Double valor, ContaBancaria contaDestino){

        //efetua um saque na conta atual
        this.sacar(valor);
        //efetua  o deposito na conta desti
        contaDestino.depositar(valor);
    }
    //#endregion
}
