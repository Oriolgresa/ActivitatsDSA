package edu.upc.eetac.dsa;

import java.util.HashMap;

/**
 * Created by OriolGresa on 3/10/16.
 */
public class Factory {
    private static Factory instance;
    private HashMap<String,Command> cache;
    private Factory(){
        cache = new HashMap<String, Command>();
    }
    public static Factory getInstance(){
        if(instance==null) instance = new Factory();
        return instance;
    }
    public Command getCommand (String cmd) throws ClassNotFoundException, IllegalAccessException, InstantiationException{
        Command c = cache.get(cmd);
        if(c==null){
            Class cl = Class.forName("edu.upc.eetac.dsa."+cmd);
            c = (Command) cl.newInstance();
            cache.put(cmd,c);
        }
        return c;
    }
}
