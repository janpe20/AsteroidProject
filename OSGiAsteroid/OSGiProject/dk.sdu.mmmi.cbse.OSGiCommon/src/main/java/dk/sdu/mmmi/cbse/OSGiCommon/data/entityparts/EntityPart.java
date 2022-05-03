package dk.sdu.mmmi.cbse.OSGiCommon.data.entityparts;

import dk.sdu.mmmi.cbse.OSGiCommon.data.Entity;
import dk.sdu.mmmi.cbse.OSGiCommon.data.GameData;

public interface EntityPart {
    void process (GameData gameData, Entity entity);
}
