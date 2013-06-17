
package trabalhoJogo;


/**
 * @author Thamires Mari
 */
public class Heroi extends Personagem{
    
    private int resistencia; 
    
    @Override
	public String toString() {
		return "Heroi [resistencia=" + resistencia + ", getNome() = " + getNome() + 
				", getExperiencia() = " + getExperiencia() + ", getPoder() = " + getPoder() + 
				", getArma() = " + getArma() + "]";
	}

	public Heroi(String nome, int experiencia, int resistencia, Poder poder, Arma arma){
    	this.resistencia = resistencia;
    	setNome(nome);
    	setArma(arma);
    	setExperiencia(experiencia);
    	setPoder(poder);
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

	@Override
	public int calcularPontos() {
		return 0;
	}

    
}
