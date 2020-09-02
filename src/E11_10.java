import java.util.ArrayList;

public class E11_10 {
    public static void main(String[] args) {

    }
}
class MyStack{
private ArrayList<Object> list = new ArrayList<>();

boolean empty() {
    return list.isEmpty();
}

Object peek() {
    return list.get(getSize() -1);
}

Object pop() {
    Object o = list.get(getSize() - 1);
    list.remove(list.size() - 1);
    return 0;
}

void push(Object newO) {
    list.add(newO);
}

int getSize() {
    return list.size();
}

@Override
public String toString() {
    return "stack: " + list.toString();
}


}
