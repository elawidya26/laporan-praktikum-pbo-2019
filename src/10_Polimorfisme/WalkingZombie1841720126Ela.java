/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author User
 */
public class WalkingZombie1841720126Ela extends Zombie1841720126Ela {
    public WalkingZombie1841720126Ela(int health, int level){
        this.health = health;
        this.level = level;
    }
    public void healEla(){
        if (level == 1){
            health += health*0.2;
        }else if (level == 2){
            health += health*0.3;
        }else if (level == 3){
            health += health*0.4;
        }
    }   
    public void destroyedEla(){
        health -= health*0.19;
    }
    public String getZombieInfoEla(){
        String info = "Walking Zombie Data = ";
        info += super.getZombieInfoEla()+"\n";
        return info;
    }  
}
