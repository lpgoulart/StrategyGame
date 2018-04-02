/**
*	@author Leonardo Goulart
*	@version 1.0
*/

public class Japones extends Castelo {
	protected int numSamurais;

/**
*	Construtor
*/
	Japones () {
		super ();
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
// Get e Set *Numero Samurais
	/**
	*	@param Da um novo valor para a variavel *numSamurais
	*/
		public void setNumSamurais ( int numSamurais ) {
			this.numSamurais = numSamurais;
		}

	/**
	*	@return Retorna o valor de *numSamurais
	*/	
		public int getNumSamurais () {
			return this.numSamurais;
		}
//---------------------------------------------------
}