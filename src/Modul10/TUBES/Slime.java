package Modul10.TUBES;

public class Slime extends Enemy {
    public Slime(int level) {
        this.name = "Slime";
        this.health = 5 * level;
        this.maxHealth = 5 * level;
        this.attack = 1 * level;
        this.defense = 0;
        this.experience = 3 * level;
        this.level = level;
    }

    public String IntroAlley() {
        super.IntroAlley();
        System.out.println("Boing! Boing! Boing!");
        return word;
    }
}
