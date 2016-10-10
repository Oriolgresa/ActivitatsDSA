package edu.upc.eetac.dsa;

import java.lang.reflect.Field;

/**
 * Created by OriolGresa on 10/10/16.
 */
public abstract class DAO {

    public void insert(){
        StringBuffer sb = new StringBuffer();
        sb.append("INSERT INTO ").append(this.getClass().getSimpleName());
        System.out.println(sb.toString());

        Field [] fields = this.getClass().getFields();

        for(Field f : fields){
            System.out.println(f.getName());
        }
    }

    public void select(int pk){

    }

    public void update(){

    }

    public void delete(){

    }
}
