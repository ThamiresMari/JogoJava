
package trabalhojogo;

/**
 * @author Thamires Mari
 */
public abstract class Personagem extends Arma{
   
    private String nome;
    private int experiencia;
    
    public Personagem(){
        
    }
    
    public Personagem(String descricao, int valor, int quantidade,  int valorp, String descricaop, String nome, int experiencia){
        super(descricao, valor, quantidade, valorp, descricaop);
        this.nome = nome;
        this.experiencia = experiencia;     
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
   

    @Override
    public String toString() {
        return  super.toString() +
                "Nome=" + this.getNome() + "\n" +
                "Experiencia=" + this.getExperiencia() + '\n';
    }
    
    public abstract int CalcularPontos();        
}
