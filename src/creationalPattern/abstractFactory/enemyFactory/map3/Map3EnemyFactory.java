package creationalPattern.abstractFactory.enemyFactory.map3;

import creationalPattern.abstractFactory.Boss;
import creationalPattern.abstractFactory.HardEnemy;
import creationalPattern.abstractFactory.NormalEnemy;
import creationalPattern.abstractFactory.boss.Map2Boss;
import creationalPattern.abstractFactory.boss.Map3Boss;
import creationalPattern.abstractFactory.enemyFactory.EnemyFactory;
import creationalPattern.abstractFactory.hardEnemy.Map2HardEnemy;
import creationalPattern.abstractFactory.hardEnemy.Map3HardEnemy;
import creationalPattern.abstractFactory.normalEnemy.Map2NormalEnemy;
import creationalPattern.abstractFactory.normalEnemy.Map3NormalEnemy;

public class Map3EnemyFactory implements EnemyFactory {
    @Override
    public NormalEnemy createNormalEnemy() {
        return new Map3NormalEnemy();
    }

    @Override
    public HardEnemy createHardEnemy() {
        return new Map3HardEnemy();
    }

    @Override
    public Boss createBoss() {
        return new Map3Boss();
    }
}
