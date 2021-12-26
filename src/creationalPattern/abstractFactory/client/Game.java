package creationalPattern.abstractFactory.client;

import creationalPattern.abstractFactory.Boss;
import creationalPattern.abstractFactory.NormalEnemy;
import creationalPattern.abstractFactory.boss.BossFactory;
import creationalPattern.abstractFactory.enemyFactory.EnemyFactory;
import creationalPattern.abstractFactory.enemyFactory.SingletonEnemyFactory;
import creationalPattern.abstractFactory.enemyFactory.map1.Map1EnemyFactory;
import creationalPattern.abstractFactory.enemyFactory.map2.Map2EnemyFactory;
import creationalPattern.abstractFactory.enemyFactory.map3.Map3EnemyFactory;

import java.util.ArrayList;

public class Game {
    private int level;
    private EnemyFactory enemyFactory;
    private ArrayList<NormalEnemy> normalEnemies;
    private Boss boss;

    public Game(int level) {
        switch (level) {
            case 1 -> {
                enemyFactory = new Map1EnemyFactory();
            }
            case 2 -> {
                enemyFactory = new Map2EnemyFactory();
            }
            case 3 -> enemyFactory = new Map3EnemyFactory();
            // . . .
        }
    }

    public void init() {
        for (int index = 0; index < 10; index++)
            normalEnemies.add(enemyFactory.createNormalEnemy());
            //normalEnemies.add(SingletonEnemyFactory.getEnemyFactory(level).createNormalEnemy());
    }
}
