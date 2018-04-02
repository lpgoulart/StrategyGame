/**
*	@author Leonardo Goulart
*	@author Arthur Cohen
*	@version 1.0
*/

public class Castelo {
	
	protected double defesas;
	protected int[] localizacao;
	protected double pontosVida;
	protected String nome;

	/**
	 *	Construtor
	 *  @param defesas Os pontos de defesa que o castelo possui
	 *  @param localizacao Um vetor unidimensional de tamanho 2 que representa a localizacao do castelo no tabuleiro como um par ordenado
	 *  @param pontosVida Os pontos de vida que o castelo possui
	 *  @param nome Representacao textual do castelo
	 */
	Castelo (double defesas, int[] localizacao, double pontosVida, String nome) {
		this.defesas = defesas;
		this.localizacao = localizacao;
		this.pontosVida = pontosVida;
		this.nome = nome;
	}

	/**
	 *	Retorna todas informacoes importantes sobre o castelo
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
		if (this.defesas > 0){
			this.defesas -= dano;
		}else{
			this.pontosVida -= dano;
		}
	}

	/**
 	 *	@param defesas Da um novo valor para a variavel defesas
	 */
	public void setDefesas(double defesas){
		this.defesas = defesas;
	}

	/**
	 *	@return Retorna a variavel defesas
	 */	
	public double getDefesas() {
		return this.defesas;
	}

	/**
	 *	@param localiacao Da um novo valor para a variavel localizacao
	 */
	public void setLocalizacao(int[] localizacao){
		this.localizacao = localizacao;
	}

	/**
	 *	@return Retorna o valor da variavel Localizacao	
	 */	
	public int[] getLocalizacao(){
		return this.localizacao;
	}

	/**
	 *	@param pontosVida Da um novo valor para a variavel pontosVida
	 */
	public void setPontosVida(double pontosVida){
		this.pontosVida = pontosVida;
	}

	/**
	 *	@return Retorna o valor da variavel pontosVida
	 */	
	public double getPontosVida(){
		return this.pontosVida;
	}

	/**
	 *	@param nome Da um novo valor para a variavel nome
	 */
	public void setNome(String nome){
		this.nome = nome;
   	}

	/**
	 *	@return Retorna a variavel *nome
	 */	
	public String getNome(){
		return this.nome;
	}

}