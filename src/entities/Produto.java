package entities;

public class Produto{
    private String nome;
    private Double preco;

    public Produto() {
    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    //usando método
    //Trabalha com produto qe passar como argumento
    public static boolean staticProdutoPredicate(Produto p){
        return p.getPreco()>= 2500.00;
    }
    //Método não estático
    //não trabalha com argumentos
    public boolean nonStaticProdutopredicate(){
        return getPreco()>= 2500.00;
    }
    @Override
    public String toString() {
        return "nome = " + nome + "; preco = " + preco + "\n";
    }
}
