package fr.unilim.iut.spaceinvaders;

public class Missile extends Sprite {

	private Dimension dimensionMissile;
	private Position positionOrigineMissile;
	private int vitesseMissile;

	public Missile(Dimension dimensionMissile, Position positionOrigineMissile, int vitesseMissile) {
		this.dimensionMissile = dimensionMissile;
		this.positionOrigineMissile =positionOrigineMissile;
		this.vitesseMissile = vitesseMissile;
	}

}