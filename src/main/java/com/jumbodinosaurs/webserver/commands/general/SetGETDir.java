package com.jumbodinosaurs.webserver.commands.general;

import com.jumbodinosaurs.devlib.commands.Command;
import com.jumbodinosaurs.devlib.commands.MessageResponse;
import com.jumbodinosaurs.devlib.commands.exceptions.WaveringParametersException;
import com.jumbodinosaurs.devlib.options.Option;
import com.jumbodinosaurs.webserver.commands.OperatorConsole;
import com.jumbodinosaurs.webserver.util.OptionIdentifier;
import com.jumbodinosaurs.webserver.util.OptionUtil;
import com.jumbodinosaurs.webserver.util.ServerUtil;

import java.io.File;

public class SetGETDir extends Command
{
    @Override
    public MessageResponse getExecutedMessage() throws WaveringParametersException
    {
        System.out.println("Enter the Path to the new GET Dir");
        String path = OperatorConsole.getEnsuredAnswer();
        ServerUtil.getDirectory = new File(path);
        Option getDirPath = new Option(path, OptionIdentifier.getDirPath.getIdentifier());
        OptionUtil.setOption(getDirPath);
        return new MessageResponse("GET Dir has been changed to " + path + ".");
    }
    
    @Override
    public String getHelpMessage()
    {
        return "Sets the dir where Files are retrieved from";
    }
}