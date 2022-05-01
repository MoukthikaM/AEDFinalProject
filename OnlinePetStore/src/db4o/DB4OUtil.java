/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db4o;

/**
 *
 * @author moukthikamanapati
 */

import com.db4o.Db4oEmbedded;
import com.db4o.EmbeddedObjectContainer;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import onlinepetstore.ConfigureASystem;
import onlinepetstore.OnlineStore;


public class DB4OUtil {

    private static final String FILENAME = Paths.get("Datanew.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
    private static final Logger logger = Logger.getLogger(DB4OUtil.class.getName());
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {

 
            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
                 
            EmbeddedObjectContainer db = Db4oEmbedded.openFile(config,FILENAME);
            System.out.println("db "+db.toString());
       
            ObjectContainer session =  db.ext().openSession();
                System.out.println("session after ");
        System.out.println(session);
            return db;

    }

    public synchronized void storeSystem(OnlineStore system) {
//        System.out.println("post store    "+system.toString());
        ObjectContainer conn = createConnection();
        System.out.println("    ");
          System.out.println(" connection testing");
        System.out.println(conn);
        System.out.println("storing");
     try{
        conn.store(system);
        conn.commit();
     }
     finally{
        conn.close();
    }
    }
    public OnlineStore retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<OnlineStore> systems = conn.query(OnlineStore.class); // Change to the object you want to save
        OnlineStore system;
        if (systems.isEmpty()){
             System.out.println("retrieve conn");
            system = ConfigureASystem.configure();  
System.out.println(system.toString());// If there's no System in the record, create a new one
        }
        else{
             System.out.println("no conn");
            system = systems.get(systems.size() - 1);
            System.out.println(System.class);
            //system = ConfigureASystem.configure(); 
        }
        conn.close();
        return system;

    }
}
