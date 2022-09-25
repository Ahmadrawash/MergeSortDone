public class MergeSortArray {
  public void  MergeSortArray(int[] A){
     MergeSort(A, 0, A.length-1);
 }
  void MergeSort(int[] A, int low, int high)
 {
     int mid = (int)(Math.ceil(low + high)/2);
     if (low < high)
     {
         MergeSort(A, low, mid);
         MergeSort(A, mid+1, high);
         merge(A, low, mid, high);
     }
 }
 public void merge(int[] A, int low, int mid, int high)
 {
     //if (low <= high)
     //{
         int m = 0, n = 0, k = low;

         int n1 = mid-low+1;
         int n2 = high-mid;
         System.out.println("n1: " + n1 + ", n2: " + n2);
         int[] fhalf = new int[n1];
         for(int i = 0 ; i < n1; i++)
             fhalf[i] = A[i+low];
         int[] shalf = new int[n2];
         for(int i = 0 ; i < n2; i++)
            shalf[i] = A[i+mid+1];
//     int[] fhalf = new int[n1];
//     for(int i = low, ind =0 ; i < n1; i++, ind++)
//         fhalf[ind] = A[i];
//     int[] shalf = new int[n2];
//     for(int i = mid+1, ind = 0 ; i < n2; i++, ind++)
//         shalf[ind] = A[i];
         System.out.println("fhasl: (low: " + low + ", mid: " + mid + ", high: " + high);
         Sort.PrintArray(fhalf);
         System.out.println("shalf: (low: " + low + ", mid: " + mid + ", high: " + high);
         Sort.PrintArray(shalf);

         while (m < n1 && n < n2)
         {
             if (fhalf[m] <= shalf[n])
             {
                 A[k] = fhalf[m];
                 m++;
             }
             else {
                 A[k] = shalf[n];
                 n++;
             }
             k++;
         }
         while ( m < n1)
         {
             A[k] = fhalf[m];
             m++;
             k++;
         }
         while (n < n2)
         {
             A[k] = shalf[n];
             n++;
             k++;
         }
     //}
 }
}

