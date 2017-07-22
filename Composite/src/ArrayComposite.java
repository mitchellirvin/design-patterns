/**
 * Created by Mitch on 10/3/2015.
 */
import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayComposite extends Composite {

    Composite[] composites = new Composite[10];
    int valuesInArray = 0;
    String type = "ArrayComposite";

    public ArrayComposite(Composite... values) {

        for(Composite c : values){
            insert(c);
        }
    }

    public void insert(Composite newComposite){

        if(valuesInArray == 0)
            composites[0] = newComposite;
        else if(valuesInArray > 9) {
            System.out.println("ArrayComposite is FULL");
            return;
        }
        for(int i=1; i <= valuesInArray; i++){
            if(i == valuesInArray)
                composites[i] = newComposite;
        }
        valuesInArray++;
    }

    public void remove(Composite newComposite){

        ArrayList<Object> list = new ArrayList<Object>(Arrays.asList(composites));
        list.remove(Arrays.asList(newComposite));
        composites = list.toArray(composites);
        valuesInArray--;
    }

    public String returnType(){
        return type;
    }

    public String toString(){
        String newStr = "ArrayComposite containing ";
        int tab = 1;
        if(composites[0] == null)
            return null;
        for(int i=0; i < valuesInArray-1; i++){
            newStr += "\n\t" + composites[i].toString(tab);
            if(type != composites[i+1].returnType()){
                tab++;
            }
        }
        newStr += "\n\t" + composites[valuesInArray-1].toString(tab);
        return newStr;
    }

    public String toString(int tab){
        String newStr = "ArrayComposite containing ";
        String tabs = "";
        for(int i=tab; i>0; i--){
            tabs += "\t";
        }
        for(int i=0; i < valuesInArray; i++){
            if(type != composites[i].returnType()){
                tab++;
            }
            newStr += "\n" + tabs + composites[i].toString(tab);
        }

        return newStr;
    }
}
