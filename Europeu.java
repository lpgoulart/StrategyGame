/**
*	@author Leonardo Goulart
*	@version 1.0
*/

public class Europeu extends Castelo {
	protected int numPaladinos;

	/**
	 *	Construtor
	 */
	Europeu () {
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

	/**
	 *	@param Da um novo valor para a variavel *numPaladinos
	 */
	public void setNumPaladinos ( int numPaladinos ) {
		this.numPaladinos = numPaladinos;
	 }

	/**
	 *	@return Retorna o valor de *numPaladinos
	 */	
	public int getNumPaladinos () {
		return this.numPaladinos;
	 }

}