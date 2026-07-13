public class July_6_1 {
       public static int kthElement(int a[], int b[], int k) {
        // code here
        int m=a.length;
        int n=b.length;
        int i=0,j=0;
        int[] result=new int[m+n];
        int r=0;
        while(i<m && j<n){
            
            if(a[i]<b[j]){
                result[r++]=a[i];
                 i++;
            }
           
            else{
                result[r++]=b[j];
                j++;
            }
            
        }
        while(i<m){
            result[r++]=a[i];
            i++;
        }
        while(j<n){
            result[r++]=b[j];
            j++;
        }
        return result[k-1];
    }
    public static void main(String[] args) {
       int a[] = {2, 3, 6, 7, 9};
       int b[] = {1, 4, 8, 10};
       int k = 5;
       int ans=kthElement(a,b,k);
       System.out.println(ans);
    }
}
// Given two sorted arrays a[] and b[] and an element k, the task is to find the element that would be at the kth position of the combined sorted array.