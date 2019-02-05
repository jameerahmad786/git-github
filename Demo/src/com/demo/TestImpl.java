package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestImpl {


	public int[] mergeArrays(int[]arr1,int[]arr2){
		List list1=new ArrayList(Arrays.asList(arr1));
		list1.addAll(Arrays.asList(arr2));
		Collections.sort(list1);
		Object res[]=list1.toArray();
		int res1[]=new int[res.length];
        for (int i=0; i<res.length;i++){
            res1[i]=(Integer)res[i];
        }
		return res1;
	}
    public static void main(String args[]){
        int arr1[]={-1,1,3,5,7,9};
        int arr2[]={-2,2,3,4,5,6};
        int res[]=new TestImpl().mergeArrays(arr1,arr2);
        Integer res1[]=new Integer[res.length];
        System.out.println(Arrays.asList(res1));
    }
}
