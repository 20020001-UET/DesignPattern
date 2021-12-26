package creationalPattern.abstractFactory.enemyFactory.map1;

import creationalPattern.abstractFactory.Boss;
import creationalPattern.abstractFactory.HardEnemy;
import creationalPattern.abstractFactory.NormalEnemy;
import creationalPattern.abstractFactory.boss.Map1Boss;
import creationalPattern.abstractFactory.enemyFactory.EnemyFactory;
import creationalPattern.abstractFactory.hardEnemy.Map1HardEnemy;
import creationalPattern.abstractFactory.normalEnemy.Map1NormalEnemy;

public class Map1EnemyFactory implements EnemyFactory {
    @Override
    public NormalEnemy createNormalEnemy() {
        return new Map1NormalEnemy();
    }

    @Override
    public HardEnemy createHardEnemy() {
        return new Map1HardEnemy();
    }

    @Override
    public Boss createBoss() {
        return null;
    }
}
