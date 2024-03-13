package first;
public class Carro {
    //Utilizando o # consegue se criar regiôes para controle da programação

    //#region Atributos
    private String modelo;
    private int ano;
    private String cor;
    //#endregion

    //#region Construtores
    public Carro(){}

    public Carro(String modelo, Integer ano, String cor){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
    //#endregion

    //#region Getters e Setters
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    //#endregion
}
