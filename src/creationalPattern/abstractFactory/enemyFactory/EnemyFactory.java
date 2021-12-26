package creationalPattern.abstractFactory.enemyFactory;

import creationalPattern.abstractFactory.Boss;
import creationalPattern.abstractFactory.HardEnemy;
import creationalPattern.abstractFactory.NormalEnemy;

public interface EnemyFactory {
    NormalEnemy createNormalEnemy();
    HardEnemy createHardEnemy();
    Boss createBoss();
}
