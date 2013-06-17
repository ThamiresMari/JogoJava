
package trabalhoJogo;

/**
 * @author Thamires Mari
 */
public class Arma extends Poder{
   
    private String descricao;
    private int valor;
    private int quantidade;
    
    public Arma(){
        
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return  super.toString() +
               "Descricao=: " + this.getDescricao() + "\n" +
               "Valor: " + this.getValor() + "\n" +
               "Quantidade: " + this.getQuantidade() + '\n';
    }
    
       
}
