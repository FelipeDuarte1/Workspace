package first;
public class Pessoa {

//declarando as variaveis(que são as propriedades da classe/classificação)
//private é o metodo, que faz com que somente essa classe consigue acessar esses atributos
//Atributos
    private String nome;
    private Integer idade;

    //Usando os Set e Get o seu programa fica totalmente protegido dentro de sua classe
    //Setters ( altera o valor de idade)
    public void setNome(String nome){
        //Aqui pode ter validações e outros.
        this.nome = nome;
    }
    //Getters (retorna o valor de idade)
    public String getNome(){
        return this.nome;
    } 
    public Integer getIdade(){
        return this.idade;
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }
    
/*METODOS ACESSORES:
* 
* PUBLIC: indicar que qualquer um pode acessar o elemento
* PRIVATE: indica que somente a classa consegue
* PROTECTED: Indica que somente a classe e seus filhos consegue acessar.
* DEFAULT: indica que somente e a classe, seus filhos e as classes no mesmo package, podem acessar
*/

/*
 * Getters e Setters
 * 
 */
}
