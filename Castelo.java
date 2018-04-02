/**
*	@author Leonardo Goulart
*	@version 1.0
*/

public class Castelo {
	
	protected double defesas;
	protected double localizacao;
	protected double pontosVida;
	protected String nome;

/**
*	Construtor
*/
	Castelo () {

	}

/**
*	Mostrar situacao
*/
	public void mostrarSituacao() {

	}

/**
*	Realiza um ataque
*	@param Recebe um valor de ataque
*/
	public void ataque ( double dano ) {
		this.pontosVida -= dano;
	}

//---------------------------------------------------
// Get e Set *Defesas
	/**
	*	@param Da um novo valor para a variavel *defesas
	*/
		public void setDefesas ( double defesas ) {
			this.defesas = defesas;
		}

	/**
	*	@return Retorna a variavel *defesas
	*/	
		public double getDefesas () {
			return this.defesas;
		}
//---------------------------------------------------

//---------------------------------------------------
// Get e Set *localizacao
	/**
	*	@param Da um novo valor para a variavel *localizacao
	*/
		public void setLocalizacao ( double localizacao ) {
			this.localizacao = localizacao;
		}

	/**
	*	@return Retorna o valor da variavel Localizacao	
	*/	
		public double getLocalizacao () {
			return this.localizacao;
		}
//---------------------------------------------------

//---------------------------------------------------
// Get e Set *Pontos Vida
	/**
	*	@param Da um novo valor para a variavel *pontosVida
	*/
		public void setPontosVida ( double pontosVida ) {
			this.pontosVida = pontosVida;
		}

	/**
	*	@return Retorna o valor da variavel *pontosVida
	*/	
		public double getPontosVida () {
			return this.pontosVida;
		}
//---------------------------------------------------

//---------------------------------------------------
// Get e Set *Nome
	/**
	*	@param Da um novo valor para a variavel *nome
	*/
		public void setNome ( String nome ) {
			this.nome = nome;
		}

	/**
	*	@return Retorna a variavel *nome
	*/	
		public String getNome () {
			return this.nome;
		}
//---------------------------------------------------






}