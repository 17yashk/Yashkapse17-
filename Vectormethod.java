import java.util.*;
class Vectormethod
{
    public static void main(String[] args)
    {
        Vector list = new Vector();
        list.addElement("Yash");
        System.out.println(list);
        list.insertElementAt("kapse",1);
        System.out.println(list);
        list.removeElement("Yash");
        System.out.println(list);
        System.out.println("Size of the Vector:" + list.size());
        System.out.println("Capacity of the vector:" + list.capacity());
        list.removeAllElements();
        System.out.println(list);
        list.insertElementAt("first",0);
        System.out.println(list);
        System.out.println("first element is:" + list.firstElement());
        
        
    }
}