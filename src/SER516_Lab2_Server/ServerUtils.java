package SER516_Lab2_Server;

import SER516_Lab2_Server.UIComponents.ServerUI;
/**
* This java class create to diplay the error messages on console.
* @author Anuradha Shilimkar
* @version 1.1
*/

public class ServerUtils {
    /*
        This method is used to pass the error messages on console.
        @param  errorMessage
     */
    public static void displayConsoleMessage(String errorMessage)
    {
        ServerUI.setConsoleTextPane(errorMessage + "\n");
    }

}
