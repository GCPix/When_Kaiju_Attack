package Vehicle;

import Behaviours.IDamage;

public class Navy extends Vehicle {


    public Navy(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

    public void attack(IDamage damageObject) {
        damageObject.takeDamage(this.getAttackValue());
    }

    public void takeDamage(int damage) {
        this.setHealthValue(this.getHealthValue()-damage*2);

    }
}
