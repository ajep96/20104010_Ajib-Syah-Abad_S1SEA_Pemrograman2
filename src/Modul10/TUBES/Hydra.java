package Modul10.TUBES;

public class Hydra extends Enemy {
    public Hydra(int level){
        this.name = "Hydra";
        this.health = 50 * level;
        this.maxHealth = 50 * level;
        this.attack = 30 * level;
        this.defense = 20 * level;
        this.experience = 35 * level;
        this.level = level;
    }

    public String  IntroAlley() {
        super.IntroAlley();
        System.out.println("Hahaha, Human? its sound easy! \nHuman are weak");
        return word;
    }
}
