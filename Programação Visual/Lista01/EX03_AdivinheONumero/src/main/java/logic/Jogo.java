/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author crist
 */
public class Jogo {
    
    private int lifePoints;
    private int minRange;
    private int maxRange;
    private int number;
    
    public Jogo(){
        this.lifePoints = 5;
    }

    // =======================**************=================================
    public void startGame() {
        double n = (Math.random() * maxRange) + minRange;
        n = Math.ceil(n);
        this.number = (int) n;
    }

    public int compareBet(int bet) {
        if (bet > number) {
            return 1;
        } else if (bet < number) {
            return -1;
        } else {
            return 0;
        }
    }

   

    // =======================**************=================================
    public void setDificultyEasy() {
        this.minRange = 0;
        this.maxRange = 10;
    }

    public void setDificultyMedium() {
        this.minRange = 0;
        this.maxRange = 50;
    }

    public void setDificultyHard() {
        this.minRange = 0;
        this.maxRange = 100;
    }
    
     public void loseLifePoints() {
        this.lifePoints--;
    }
    // =======================**************=================================

   
 

    public int getLifePoints() {
        return lifePoints;
    }

    public void setMinRange(int minRange) {
        this.minRange = minRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

}
