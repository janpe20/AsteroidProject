package dk.sdu.mmmi.cbse.OSGiCommon.data.entityparts;

import dk.sdu.mmmi.cbse.OSGiCommon.data.Entity;
import dk.sdu.mmmi.cbse.OSGiCommon.data.GameData;

public class LifePart implements EntityPart {

    private boolean dead = false;
    private int life;
    private boolean isHit = false;
    private float expiration;

    public LifePart(int life, float expiration) {
        this.life = life;
        this.expiration = expiration;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isIsHit() {
        return isHit;
    }

    public void setIsHit(boolean isHit) {
        this.isHit = isHit;
    }

    public float getExpiration() {
        return expiration;
    }

    public void setExpiration(float expiration) {
        this.expiration = expiration;
    }

    public void reduceExpiration(float delta) {
        this.expiration -= delta;
    }

    @Override
    public void process(GameData gameData, Entity entity) {
        if (isHit) {
            life = -1;
            isHit = false;
        }
        if (life <= 0) {
            dead = true;
        }

    }
}
