package Kaiju;

import Behaviours.IDamage;

public class Otachi extends Kaiju{
    public Otachi(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String move(String moveInstruction) {
        return this.getName() + " moves quickly to " + moveInstruction;
    }

    public void attack(IDamage damageValue) {
        damageValue.takeDamage(this.getAttackValue());

}

    public void takeDamage(int damage) {
        this.setHealthValue(this.getHealthValue()-damage);
    }


}
