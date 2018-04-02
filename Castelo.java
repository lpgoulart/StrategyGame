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
	 *	@param dano Recebe um valor de ataque
	 */
	public void ataque ( double dano ) {
		this.pontosVida -= dano;
	 }

	/**
 	 *	@param defesas Da um novo valor para a variavel *defesas
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

	/**
	 *	@param localiacao Da um novo valor para a variavel *localizacao
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

	/**
	 *	@param pontosVida Da um novo valor para a variavel *pontosVida
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

	/**
	 *	@param nome Da um novo valor para a variavel *nome
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

}