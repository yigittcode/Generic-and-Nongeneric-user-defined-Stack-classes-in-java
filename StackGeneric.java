import java.util.ArrayList;

public class StackGeneric<T> {

    /*
    push (item)
    pop()
    showLast()
    size()
    isEmpty()
     */


private ArrayList<T> arrayList = new ArrayList();
private  int len = 0;
int size(){
    return len;
}
void push(T item){
    arrayList.add(item);
    len ++;
}
void pop(){
    if (len ==0) return;
    arrayList.remove(len-1);
    len--;
}
boolean isEmpty(){
    if (len == 0){
        return true;
    }
    else {
        return false;
    }

}
T showLast (){
    if(len ==0) {
        return null;
    }
    return arrayList.get(len-1);
}


}
