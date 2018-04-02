/**
*	@author Leonardo Goulart
*	@author Arthur Cohen
*	@version 1.0
*/
import java.util.List;
import java.util.ArrayList;

public class Europeu extends Castelo {
	private List<Paladino> paladinos;

	/**
	 *	Construtor
	 *  @param defesas Os pontos de defesa que o castelo possui
	 *  @param localizacao Um vetor unidimensional de tamanho 2 que representa a localizacao do castelo no tabuleiro como um par ordenado
	 *  @param pontosVida Os pontos de vida que o castelo possui
	 *  @param nome Representacao textual do castelo
	 */
	Europeu(double defesas, int[] localizacao, double pontosVida, String nome){
		super(defesas, localizacao, pontosVida, nome);
		this.paladinos = new ArrayList<Paladino>();
	}

	/**
	 *	Mostrar situacao
	 *  @return Informacoes sobre o castelo
	 */
	public String mostrarSituacao() {
		return "";
	}

	/**
	 *	Realiza o calculo de um ataque sofrido
	 *	@param dano O valor que representa o ataque sofrido
	 */
	public void ataque(double dano){
		if (this.paladinos.size() > 0){
			// Matar de 2 a 5 guerreiros
			
		}else{
			super.ataque(dano);
		}
	}

	/**
	 *	@param paladinos Da um novo valor para a variavel paladinos
	 */
	public void setPaladinos(List<Paladino> paladinos){
		this.paladinos = paladinos;
	}

	/**
	 *	@return Retorna o valor de paladinos
	 */	
	public List<Paladino> getPaladinos(){
		return this.paladinos;
	}
}