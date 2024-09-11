package com.factory;

public interface GameElementFactory {
	Enemy createEnemy();
    Weapon createWeapon();
    PowerUp createPowerUp();

}