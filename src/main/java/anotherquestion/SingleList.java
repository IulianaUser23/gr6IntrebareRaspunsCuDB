package anotherquestion;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by icondor on 04/02/17.
 */
public class SingleList {

    private static SingleList m;

   // singleton
    public static SingleList getInstance() {

        if(m==null) {
            m=new SingleList();
        }
        return m;
    }


    private List<String> intrebare = new LinkedList<String>();

    public void addIntrebare(String s) {
        intrebare.add(s);
    }

    public void afiseza() {

        for(String a: intrebare)
        {
            System.out.println(a);
        }
    }

    public List getIntrebari() {
        return intrebare;
    }

//    public String returnJson() {
//
//        StringBuffer s;
//        s.append("{")
//        for(String a: intrebare)
//        {
//            s.append("")
//        }
//        s.append("}");
//
//    }




}
