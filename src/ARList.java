import java.util.ArrayList;
public class ARList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<10; i++) {
            list.add(i, i + 1);
        }




        System.out.print(list);
    }
}
