

import java.util.*;

class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array:\n");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of array\n");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the search elements:\n");
        int se = sc.nextInt();
        int index=binaryserch(a,0,n-1,se);
        if(index==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element fount at %d index",index);
        }
    }
}
static binaryserch(int[] arr, int start, int end, int se)
{
    int mid = start + (end - start) / 2;
    if (arr[mid] == se)
    {
	    return mid;
    }
    if (arr[mid] > se)
    {
	    return binarysearch(arr, start, mid - 1, se);
    }
    else if(arr[mid]<se)
    {
        return binarysearch(arr, mid + 1, end, se);
    }
    return -1;
}