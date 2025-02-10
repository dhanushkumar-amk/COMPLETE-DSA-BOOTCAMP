class ArrayDefault{
public static void main(String[] args) {
       
       int[] arr = {1,3,2,4,5};
       
       int count = 0;
       int max = -2455435;
      for(int i= 0; i < arr.length; i++){
          if(arr[i] > max){
              max = arr[i];
              count++;
          }
      }
       System.out.println(count);
    }
}
