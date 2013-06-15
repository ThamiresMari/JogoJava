
package trabalhoJogo;

/**
 * @author Thamires Mari
 */
public class Vilao extends Personagem{
   
    private int genialidade;
    
    public Vilao(){
        
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

	@Override
	public int calcularPontos() {
		// TODO Auto-generated method stub
		return 0;
	}
    
        
}
