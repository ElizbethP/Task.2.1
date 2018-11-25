package com.liza;


public class BattleStage {


      public static String startButtle(Hero hero, Monster monster) {

                while ((hero.getHp() > 0) && (monster.getHp() > 0)) {

                    monster.setHp(monster.getHp() - hero.getDmg());

                    if (monster.getHp() <= 0) {

                        monster.setHp(0);
                        System.out.println(" Hero attacked montser, he made "
                                + hero.getDmg()
                                + " damage, montsers hp is " + monster.getHp());

                        break;
                    }
                    System.out.println(" Hero attacked montser, he made "
                            + hero.getDmg()
                            + " damage, montsers hp is " + monster.getHp());


                    hero.setHp(hero.getHp() - monster.getDmg());

                    if (hero.getHp() <= 0) {
                        hero.setHp(0);

                        System.out.println(" Montser attacked hero , he made " +
                                monster.getDmg()
                                + " damage, heroes hp is " + hero.getHp());
                        break;
                    }
                    System.out.println(" Montser attacked hero , he made " +
                            monster.getDmg()
                    + " damage, heroes hp is " + hero.getHp());
        }
        return hero.getHp() > monster.getHp() ? "Hero wins" : "Monster wins";
    }
}
