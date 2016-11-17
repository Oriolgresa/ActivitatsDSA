package edu.upc.eetac.dsa;

import java.util.HashMap;
import org.apache.log4j.Logger;

/**
 * Created by OriolGresa on 3/10/16.
 */
public class Factory {
    static final Logger logger = Logger.getLogger(Factory.class);
    private static Factory instance;
    private HashMap<String,Command> cache;
    private Factory(){
        cache = new HashMap<String, Command>();
    }
    public static Factory getInstance(){
        if(instance==null) instance = new Factory();
        return instance;
    }
    public Command getCommand (String cmd) throws IllegalAccessException, InstantiationException {
        Command c = cache.get(cmd);
        if(c==null){
            Class cl = null;
            try {
                cl = Class.forName("edu.upc.eetac.dsa."+cmd);
            } catch (ClassNotFoundException e) {
                logger.error(cmd+" no existeix");
                //e.printStackTrace();
            }
            c = (Command) cl.newInstance();
            logger.info("cmd creat");
            cache.put(cmd,c);
            logger.info("cmd guardat en cache");

        }
        return c;
    }
}
