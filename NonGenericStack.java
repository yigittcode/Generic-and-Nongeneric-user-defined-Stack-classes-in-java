
import java.util.ArrayList;

public class NonGenericStack {

    private ArrayList list = new ArrayList();
    private int len = 0;

    void push(Object item){
        list.add(item);
        len++;
    }
    void pop(){
    if (len ==0) return;
    list.remove(len-1);
    len--;
    }
    Object showLast(){
        if (len == 0) return null;
        return list.get(len -1);
    }
    boolean isEmpty(){
        if(len ==0) return true;
        return false;
    }
    int size (){
        return len;
    }







}
