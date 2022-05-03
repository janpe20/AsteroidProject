package dk.sdu.mmmi.OSGiEnemy;

import dk.sdu.mmmi.cbse.OSGiCommon.data.Entity;
import dk.sdu.mmmi.cbse.OSGiCommon.data.GameData;
import dk.sdu.mmmi.cbse.OSGiCommon.data.World;
import dk.sdu.mmmi.cbse.OSGiCommon.data.entityparts.LifePart;
import dk.sdu.mmmi.cbse.OSGiCommon.data.entityparts.MovingPart;
import dk.sdu.mmmi.cbse.OSGiCommon.data.entityparts.PositionPart;
import dk.sdu.mmmi.cbse.OSGiCommon.services.IGamePluginService;

import java.util.Random;

public class EnemyPlugin implements IGamePluginService {

    private Entity enemy;

    public EnemyPlugin() {
    }

    @Override
    public void start(GameData gameData, World world) {
        
        // Add entities to the world
        enemy = createenemyShip(gameData);
        world.addEntity(enemy);
    }

    private Entity createenemyShip(GameData gameData) {

        float deacceleration = 10;
        float acceleration = 125;
        float maxSpeed = 150;
        float rotationSpeed = 500;
        float x = new Random().nextFloat() * gameData.getDisplayWidth();
        float y = new Random().nextFloat() * gameData.getDisplayHeight();
        float radians = 3.1415f / 2;
        
        Entity enemyShip = new Enemy();
        enemyShip.setRadius(5);
        enemyShip.add(new MovingPart(deacceleration, acceleration, maxSpeed, rotationSpeed));
        enemyShip.add(new PositionPart(x, y, radians));
        enemyShip.add(new LifePart(1,120));
        
        return enemyShip;
    }

    @Override
    public void stop(GameData gameData, World world) {
        // Remove entities
        world.removeEntity(enemy);
    }

}
