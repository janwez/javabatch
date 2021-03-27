package Jdbc;

import java.util.ArrayList;
import java.util.List;

public class collect {

    public static void main(String[] args)
    {

   //     int[] arr = new int[5];
    //    arr[0]=1;
   //     arr[1]=2;
   //     arr[2]=3;
   //     arr[3]=4;
   //     arr[4]=5;

      //  for (int i=0;i<arr.length; i++)
      //  {
        //    System.out.println(arr[i]);

     //   }
        List<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(5,6);
list.remove(1);

        list.forEach(s -> {
            System.out.println(s);
        });



    }

}
