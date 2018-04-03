/**
*	@author Leonardo Goulart
*	@author Arthur Cohen
*	@version 1.0
*	@since 1.0
*/

package castle;

import java.util.List;
import java.util.ArrayList;
import castle.units.Samurai;

public class Japones extends Castelo {
	private List<Samurai> samurais;

	/**
	 *	Construtor
	 *  @param defesas Os pontos de defesa que o castelo possui
	 *  @param localizacao Um vetor unidimensional de tamanho 2 que representa a localizacao do castelo no tabuleiro como um par ordenado
	 *  @param pontosVida Os pontos de vida que o castelo possui
	 *  @param nome Representacao textual do castelo
	 */
	Japones(double defesas, int[] localizacao, double pontosVida, String nome){
		super(defesas, localizacao, pontosVida, nome);
		this.samurais = new ArrayList<Samurai>();
	}

	/**
	 *	Mostrar situacao
	 *  @return Informacoes sobre o castelo
	 */
	public String mostrarSituacao(){
		return "";
	}

	/**
	 *	Realiza o calculo de um ataque sofrido
	 *	@param dano O valor que representa o ataque sofrido
	 */
	public void ataque(double dano){
 		if (this.samurais.size() > 0){
			// Matar de 2 a 5 guerreiros
			
		}else{
			super.ataque(dano);
		}
	}

	/**
	 *	@param Da um novo valor para a variavel *numSamurais
	 */
	public void setSamurais(List<Samurai> samurais){
		this.samurais = samurais;
	}

	/**
	 *	@return Retorna o valor de *numSamurais
	 */	
	public List<Samurai> getSamurais(){
		return this.samurais;
	}
}
