package dk.sdu.mmmi.OSGiCommon.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

public interface IEntityProcessingService {

    void process(GameData gameData, World world);
}
