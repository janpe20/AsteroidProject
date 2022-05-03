package dk.sdu.mmmi.cbse.OSGiCommon.services;

import dk.sdu.mmmi.cbse.OSGiCommon.data.GameData;
import dk.sdu.mmmi.cbse.OSGiCommon.data.World;

public interface IGamePluginService {
    void start(GameData data, World world);

    void stop(GameData data, World world);
}
