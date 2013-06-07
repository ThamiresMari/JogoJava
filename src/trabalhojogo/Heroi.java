
package trabalhojogo;

import com.sun.jndi.toolkit.ctx.HeadTail;

/**
 * @author Thamires Mari
 */
public class Heroi extends Personagem{
    
    private int resistencia; 
    
    public Heroi(){
    }
    
    public Heroi(String descricao, int valor, int quantidade,  int valorp, String descricaop, String nome, int experiencia, int resistencia) {
        super(descricao, valor, quantidade, valorp, descricaop, nome, experiencia);
        this.resistencia = resistencia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return "Resistencia: " + this.getResistencia() + '\n';
    }
    
    public int CalcularPontos(){
        return ((this.getExperiencia()* 2) + (this.getValorp() * 3) + ((this.getValor() * 5) / this.getQuantidade()) + this.getResistencia());
    }

    
}
