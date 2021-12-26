package creationalPattern.abstractFactory.enemyFactory;

import creationalPattern.abstractFactory.enemyFactory.map1.Map1EnemyFactory;
import creationalPattern.abstractFactory.enemyFactory.map2.Map2EnemyFactory;
import creationalPattern.abstractFactory.enemyFactory.map3.Map3EnemyFactory;

import java.util.ArrayList;

public class SingletonEnemyFactory {
    private static ArrayList<EnemyFactory> enemyFactories;

    static {
        enemyFactories = new ArrayList<>();
        for (int lv = 1; lv <= 3; lv++) {
            switch (lv) {
                case 1 -> {
                    enemyFactories.add(new Map1EnemyFactory());
                }
                case 2 -> {
                    enemyFactories.add(new Map2EnemyFactory());
                }
                case 3 -> {
                    enemyFactories.add(new Map3EnemyFactory());
                }
            }
        }
    }

    public static EnemyFactory getEnemyFactory(int lv) {
        return enemyFactories.get(lv-1);
    }
}
