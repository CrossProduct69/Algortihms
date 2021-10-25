package com.niraj;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSort(arr,0,arr.length);//returns a new array..original array is not modifeied
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr,int s,int e){
        if(e-s==1)
            return;
        int mid = (s+e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid,e);
        merge(arr,s,mid,e);
    }

    static void merge(int[] arr,int s,int m,int e){
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while(i<m && j< e){
            if(arr[i]<arr[j]){
                mix[k++] = arr[i];
                i++;
            }else{
                mix[k++] = arr[j];
                j++;
            }
        }
        while(i< m){
            mix[k++] = arr[i++];
        }
        while(j< e){
            mix[k++] = arr[j++];
        }

        for(int l=0;l<mix.length;l++){
            arr[s+l] = mix[l];
        }

    }

}
