package fr.unilim.iut.spaceinvaders.moteurjeu;

/**
 * permet de representer une commande de l'utilisateur
 * 
 * @author vthomas
 *
 */
public class Commande {

	/**
	 * boolean representant la commande de l'utilisateur
	 */
	public boolean gauche;
	public boolean droite;
	public boolean haut;
	public boolean bas;
	public boolean tir;

	public Commande()
	{
		
	}
	
	/**
	 * constructeur par copie
	 * copie la commande pour en creer une nouvelle
	 * @param commandeACopier
	 */
	public Commande(Commande commandeACopier)
	{
		this.gauche=commandeACopier.gauche;
		this.droite=commandeACopier.droite;
		this.haut=commandeACopier.haut;
		this.bas=commandeACopier.bas;
		this.tir=commandeACopier.tir;
	}
}
