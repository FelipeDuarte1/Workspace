package first;
public class App{
    
    public static void main(String[] args) {
        
        System.out.println("Aprende POO em java");

        //Esse comando mostra que estou instanciando uma classe, construindo um objeto.
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Fulano");
        pessoa1.setIdade(21);
        
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        
        //Isso aqui é como um construtor padrão
        Carro meuCarro = new Carro();
        meuCarro.setModelo("Honda Civic");
        meuCarro.setAno(2019);
        meuCarro.setCor("Prata");

        System.out.println(meuCarro.getModelo());
        System.out.println(meuCarro.getAno());
        System.out.println(meuCarro.getCor());

        //Isso aqui é como um construtor personalizado

        Carro novoCarro = new Carro("Fiat Toro", 2020, "Branca");

        System.out.println(novoCarro.getModelo());
        System.out.println(novoCarro.getAno());
        System.out.println(novoCarro.getCor());

        /* 
        Formas de escrever:
        PascalCase:Usado para criar aquivos e nome de classes;Ex:MeuCarro ou Cachorro.java
        CamelCase:Usado para criar objetos, dar nomes em atributos, escrever metodos;Ex: cachorroMeu

        kibab-case: nota-fiscal
        snake_case: nota_fiscal    
       * 
       * 
       * //Criando outra pessoa utilizando a mesma classe
       * 
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Ciclano";
        pessoa2.idade = 24;
        
        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.idade);

        Carro meuCarro = new Carro();
        meuCarro.ano = 2021;
        meuCarro.modelo = "Jeep";
        meuCarro.cor = "Preto";
        */
    }
}