import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int rnd = random.nextInt(1, 100);
            arrayList.add(rnd);
        }
        System.out.println("Sandar: "+arrayList);


        ArrayList<Integer> arrayList1=new ArrayList<>();
        ArrayList<Integer> arrayList2=new ArrayList<>();
        for (Integer i:arrayList) {
            if (i%2==0){
           arrayList1.add(i);
            }else {
                arrayList2.add(i);
            }

        }
        System.out.println("Jup sandar: "+arrayList1);
        System.out.println("Tak sandar: "+arrayList2);
    }
}