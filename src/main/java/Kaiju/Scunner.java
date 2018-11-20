package Kaiju;

import Behaviours.IDamage;

public class Scunner extends Kaiju  {
    public Scunner(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String move(String moveInstruction) {
        return this.getName() + " moves slowly to " + moveInstruction;
    }

    public void attack(IDamage damageObject) {
        damageObject.takeDamage(this.getAttackValue());

    }

    public void takeDamage(int damage) {
        this.setHealthValue(this.getHealthValue()-damage);
    }
}
