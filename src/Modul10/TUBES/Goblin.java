package Modul10.TUBES;

public class Goblin extends Enemy {
    public Goblin(int level) {
        this.name = "Goblin";
        this.health = 8 * level;
        this.maxHealth = 8 * level;
        this.attack = 3 * level;
        this.defense = 5 * level;
        this.experience = 5 * level;
        this.level = level;
    }

    @Override
    public String IntroAlley() {
        super.IntroAlley();
        System.out.println("Human? Sounds delicious");
        return word;
    }
}
