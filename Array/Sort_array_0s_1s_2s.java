public class Sort_array_0s_1s_2s {
    static void sorting012Array(int a[], int n) {
        int low = 0;
        int mid = 0;
        int high = n-1;
        int temp;
        while(mid <= high){
          switch(a[mid]){
            case 0:{
              temp = a[low];
              a[low] = a[mid];
              a[mid] = temp;
              low++;
              mid++;
              break;
            }
            case 1:{
              mid++;
              break;
            }
            case 2:{
              temp = a[mid];
              a[mid] = a[high];
              a[high] = temp;
              high--;
              break;
            }
          }
        }
      }
}
