package Vehicle;

import Behaviours.IDamage;
import Kaiju.Kaiju;

public class Army extends Vehicle{

    public Army(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

    public void attack(IDamage damageObject) {
        if(damageObject instanceof Kaiju)
        damageObject.takeDamage(this.getAttackValue());
    }

    public void takeDamage(int damage) {
        this.setHealthValue(this.getHealthValue()-damage*2);

    }
}
