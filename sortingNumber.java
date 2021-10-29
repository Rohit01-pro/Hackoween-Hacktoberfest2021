import java.util.*;
public class sortingNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(7);
        list.add(3);
        list.add(9);
        Collections.sort(list,new mycomparator());
        System.out.print(list);
    }

}
class mycomparator implements Comparator<Integer>{
    public int compare(Integer l1, Integer l2) {
        int o1= (int) l1;
        int o2= (int) l2;
     if(o1<o2)return 1;
     if(o1>o2)return -1;
     return 0;
    }
}
