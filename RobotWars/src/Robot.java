import java.util.Random;

public class Robot implements Attack, Attacked {
    Random random = new Random();


    int damage = random.nextInt(11) + 5;
    int defense = random.nextInt(5) + 2;
    int speed = random.nextInt(5) + 2;

    int summing = damage + defense + speed;
    int health;

    public void characteristics() {
        health = 100 - summing;
        System.out.println("Health: " + health);
        System.out.println("Damage: " + damage);
        System.out.println("Defense: " + defense);
        System.out.println("Speed: " + speed);
        System.out.println("");
    }


    public void reduceHealth(int damage) {
        health -= damage;
    }


    public int getHealth() {
        return health;

    }
    public int getDefense(){
        return defense;
    }

    @Override
    public void attack(Attacked object) {

        if (object instanceof Robot)
            ((Robot) object).reduceHealth((1+(speed/100))*damage-((Robot) object).getDefense());

    }
}