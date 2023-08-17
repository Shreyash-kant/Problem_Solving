package Java.Recursion.Easy;

import java.util.ArrayList;

//this approach is not efficient memory-wise because for every recursive call a new ArrayList is being created
//instead it, when we pass arraylist inside as argument in each call is more efficient than this. 
public class ListInsideCall {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3, 5, 3, 53, 5, 3, 5, 3, 9 };
        int target = 3;
        ArrayList<Integer> mylist = search(arr, 0, target);
        System.out.println(mylist);

    }

    static ArrayList<Integer> search(int[] arr, int indx, int target) {

        if (indx == arr.length)
            return new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        if (arr[indx] == target)
            list.add(indx);
        ArrayList<Integer> list1 = search(arr, indx + 1, target);
        // after getting list1 from all the called fuctions
        // the list inside this function(caller function) that is "list" will get
        // populated with all the values of list1.
        // then this list will get returned to its called function.
        // same thing will happen inside it's caller function and so on, untill the
        // actual list is returned to the main function.
        // Remember- in this case alse, in list1 we are getting the reference value of
        // the "list" created inside it's called function.
        for (int i = 0; i < list1.size(); ++i)
            list.add(list1.get(i));
        return list;
    }
}
