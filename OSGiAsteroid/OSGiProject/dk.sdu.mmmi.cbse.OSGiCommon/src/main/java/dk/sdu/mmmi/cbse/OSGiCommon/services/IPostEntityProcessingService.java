package dk.sdu.mmmi.cbse.OSGiCommon.services;

import dk.sdu.mmmi.cbse.OSGiCommon.data.GameData;
import dk.sdu.mmmi.cbse.OSGiCommon.data.World;

public interface IPostEntityProcessingService {
    void process(GameData gameData, World world);
}
