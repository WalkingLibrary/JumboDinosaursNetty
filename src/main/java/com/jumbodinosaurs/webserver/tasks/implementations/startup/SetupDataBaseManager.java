package com.jumbodinosaurs.webserver.tasks.implementations.startup;

import com.jumbodinosaurs.devlib.database.DataBaseManager;
import com.jumbodinosaurs.devlib.task.Phase;
import com.jumbodinosaurs.devlib.task.StartUpTask;
import com.jumbodinosaurs.webserver.util.ServerUtil;

public class SetupDataBaseManager extends StartUpTask
{
    public SetupDataBaseManager()
    {
        super(Phase.Initialization);
    }
    
    @Override
    public void run()
    {
        DataBaseManager.initializeDataBases(ServerUtil.serverDataDir);
    }
}