package i.am.edgedeveloper.tipcalculator;

/**
 * Created by OPEYEMI OLORUNLEKE on 11/15/2016.
 */

public class Soldier {
    private int health;
    private int lives;
    public int numberOfSoldiers; //These are Fields

    public Soldier(){
        numberOfSoldiers++;
        setLives(3);
        setHealth(100);
    }
    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void healSoldier(){
        setHealth(health+=25);
    }
    public void hitDetected(Soldier soldier){
    }
}
