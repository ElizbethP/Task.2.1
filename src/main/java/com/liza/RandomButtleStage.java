package com.liza;

import java.util.Random;

public class RandomButtleStage {
    public static String startButtleRandom(Hero hero, Monster monster) {
        Random random = new Random();
        while ((hero.getHp() > 0) && (monster.getHp() > 0)) {


            int h = random.nextInt(hero.getDmg() + 1);
            int m = random.nextInt(monster.getDmg() + 1);


            monster.setHp(monster.getHp() - h);

            if (monster.getHp() <= 0) {
                monster.setHp(0);
                System.out.println(" Hero attacked montser, he made " + h
                        + " damage, montsers hp is " + monster.getHp());

                break;
            }
            System.out.println(" Hero attacked montser, he made "
                    + h
                    + " damage, montsers hp is " + monster.getHp());


            hero.setHp(hero.getHp() - m);

            if (hero.getHp() <= 0) {
                hero.setHp(0);
                System.out.println(" Montser attacked hero , he made " + m
                        + " damage, heroes hp is " + hero.getHp());
                break;
            }

            System.out.println(" Montser attacked hero , he made " +
                    m
                    + " damage, heroes hp is " + hero.getHp());
        }
        return hero.getHp() > monster.getHp() ? "Hero wins" : "Monster wins";
    }
}
