package com.liza;

import static com.liza.BattleStage.startButtle;
import static com.liza.RandomButtleStage.startButtleRandom;

public class Main {
    public static void main(String[] srgs) {
        Hero hero = new Hero();
        Monster monster = new Monster();

        monster.setHp(12);
        monster.setDmg(12);

        hero.setHp(12);
        hero.setDmg(12);


        System.out.println(startButtle(hero,monster));
        System.out.println("  ");
        monster.setHp(12);
        monster.setDmg(12);

        hero.setHp(12);
        hero.setDmg(12);
        System.out.println(startButtleRandom(hero,monster));

    }

}