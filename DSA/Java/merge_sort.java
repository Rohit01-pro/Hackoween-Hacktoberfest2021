import java.util.Scanner;

public class merge_sort {
    public static void merge(int []a,int s,int m,int e){
       int l=m-s+1;
       int r=e-m;
       int left[]=new int[l];
       int right[]=new int[r];
       for(int i=0;i<l;i++)
           left[i]=a[s+i];
       for(int i=0;i<r;i++)
           right[i]=a[m+1+i];

       int i=0,j=0;
       int k=s;
       while(i<l&&j<r) {
           if (left[i] <= right[j]) {
               a[k] = left[i];
               i++;
           } else {
               a[k] = right[j];
               j++;
           }
           k++;
       }
       while(i<l){
           a[k]=left[i];
           i++;
           k++;
       }
       while(j<r){
           a[k]=right[j];
           j++;
           k++;
       }

    }
    public static void sort(int []a,int end,int start){
    if(start<end){
        int mid=(start+end)/2;
        sort(a,start,mid);
        sort(a,mid+1,end);
        merge(a,start,mid,end);
    }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []a=new int[n]; // 2 9 3 7 1 8
        for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    sort(a,n-1,0);
            for(int i=0;i<n;i++)
            System.out.println(a[i]);
    long s=System.nanoTime();
    long e=System.nanoTime();
            System.out.println(e-s);
 }
}
