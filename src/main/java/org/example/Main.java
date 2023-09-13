package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //int c[] = {1,2,3,4};

        List<Integer> list = Arrays.asList(9,5,6,7,1,2,3,-1,-2,7);

        List<Integer> res = mergeSort(list);

        for(int i: res){
            System.out.println(i);
        }


    }

    private static List<Integer> mergeSort(List<Integer> list) {

        if(list.size()<=1){
            //System.out.println("returned "+list.get(0));
            return list;
        }



        int mid = list.size()/2;

        List<Integer> l1 = mergeSort(list.subList(0,mid));
        List<Integer> l2 = mergeSort(list.subList(mid, list.size()));

        List<Integer> result= new ArrayList<>();

        int i=0, j=0;

        while(i<l1.size() && j<l2.size()){
            if(l1.get(i)<l2.get(j)){
                result.add(l1.get(i));
                //System.out.println("Adding "+l1.get(i));
                i++;
            }
            else if(l1.get(i)>l2.get(j)){
                result.add(l2.get(j));
                //System.out.println("Adding "+l2.get(j));
                j++;
            }
            else{
                result.add(l1.get(i));
                //System.out.println("Adding "+l1.get(i));
                i++;

                result.add(l2.get(j));
                //System.out.println("Adding "+l2.get(j));
                j++;

            }
        }

        while(i<l1.size()){
            result.add(l1.get(i));
            //System.out.println("Adding "+l1.get(i));
            i++;
        }
        while(j<l2.size()){
            result.add(l2.get(j));
            //System.out.println("Adding "+l2.get(j));
            j++;
        }

        return result;

    }
}