package creationalPattern.abstractFactory.enemyFactory.map2;

import creationalPattern.abstractFactory.Boss;
import creationalPattern.abstractFactory.HardEnemy;
import creationalPattern.abstractFactory.NormalEnemy;
import creationalPattern.abstractFactory.boss.Map1Boss;
import creationalPattern.abstractFactory.boss.Map2Boss;
import creationalPattern.abstractFactory.enemyFactory.EnemyFactory;
import creationalPattern.abstractFactory.hardEnemy.Map1HardEnemy;
import creationalPattern.abstractFactory.hardEnemy.Map2HardEnemy;
import creationalPattern.abstractFactory.normalEnemy.Map1NormalEnemy;
import creationalPattern.abstractFactory.normalEnemy.Map2NormalEnemy;

public class Map2EnemyFactory implements EnemyFactory {
    @Override
    public NormalEnemy createNormalEnemy() {
        return new Map2NormalEnemy();
    }

    @Override
    public HardEnemy createHardEnemy() {
        return new Map2HardEnemy();
    }

    @Override
    public Boss createBoss() {
        return new Map2Boss();
    }
}
