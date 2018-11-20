package Kaiju;

import Behaviours.IAttack;
import Behaviours.IDamage;

public abstract class Kaiju implements IAttack, IDamage {


//    Model a Kaiju.Kaiju (Large Japanese Monster) Attack On A City.
//
//    Using a Kaiju.Kaiju abstract class, create two giant lizards to run amok in Tokyo.
//    Parameters for each Kaiju.Kaiju should include name, healthValue and attackValue.
//    Give the Kaiju.Kaiju a roar method which returns a string.
//    Using a Vehicle abstract class, create two Army vehicles to battle the Kaiju.Kaiju.
//    Parameters should include type and healthValue.
//    Make an IAttack interface and an IDamage interface.
//    IAttack should contain a method attack which takes in an IDamage.
//    IDamage should contain a method takeDamage which takes in int damage.
//    Make the Kaiju.Kaiju and Vehicle implement both interface's.
//    Give the Kaiju.Kaiju a move/fly method, which returns a string (depending on the Kaiju.Kaiju).
//    todo Expand the model to include buildings, more Kaiju.Kaiju and anything else you can think of.
//    todo The building should implement IDamage but not IAttack.
    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String roar(){
        return this.name + "'s shakes the buildings";
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

    public abstract String move(String moveInstruction);

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }
}
