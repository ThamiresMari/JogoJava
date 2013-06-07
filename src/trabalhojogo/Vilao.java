
package trabalhojogo;

/**
 * @author Thamires Mari
 */
public class Vilao extends Personagem{
   
    private int genialidade;
    
    public Vilao(){
        
    }
    
    public Vilao(String descricao, int valor, int quantidade,  int valorp, String descricaop, String nome, int experiencia, int genialidade){ 
       super(descricao, valor, quantidade, valorp, descricaop, nome, experiencia);
        this.genialidade = genialidade;
    }

    public int getGenialidade() {
        return genialidade;
    }

    public void setGenialidade(int genialidade) {
        this.genialidade = genialidade;
    }

    @Override
    public String toString() {
        return "Genialidade: " + this.getGenialidade() + '\n';
    }
    
    public int CalcularPontos(){
        return ((this.getExperiencia() * 2) + (this.getValorp() * 3) + (this.getValor() *5)/ this.getQuantidade() + this.getGenialidade());
    }
    
        
}
