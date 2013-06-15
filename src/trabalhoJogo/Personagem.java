
package trabalhoJogo;

/**
 * @author Thamires Mari
 */
public abstract class Personagem{
   
    private String nome;
    private int experiencia;
    private Poder poder;
    private Arma arma;
    
    public Personagem(){}

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
    
    public abstract int calcularPontos();

	public Poder getPoder() {
		return poder;
	}

	public void setPoder(Poder poder) {
		this.poder = poder;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}        
}
