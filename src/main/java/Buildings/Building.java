package Buildings;

import Behaviours.IDamage;

public class Building implements IDamage {

    private String name;
    private int healthValue;

    public Building(String name, int healthValue) {
        this.name = name;
        this.healthValue = healthValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public void takeDamage(int damage) {
        this.setHealthValue(this.getHealthValue()-damage);
    }
}
