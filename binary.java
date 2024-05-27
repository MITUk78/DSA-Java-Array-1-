import java.util.*;

public class binary {
    public static int binarySearch(int num[],int key){
        int start=0, end =num.length-1;

        while(start <= end){
            int mid = (start + end)/2;
            
            //comparision
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){  //right
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1; //in case where value goes bigger than the actual store num value
    }

    public static void main(String args[]){
        int num[]={2,4,6,8,10,12,14};
        int key= 10;

        System.out.println("key found at index :" + binarySearch(num, key));
    }
}

