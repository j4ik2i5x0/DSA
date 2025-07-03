package Array;

public class EvenorOdd {
    public static void main(String[] args) {
        
        int[] arr = {40,2,5,3,1,5,6,23,35,9};

        int odd = 0;
        int even = 0;
        int oddsum = 0;
        int evensum = 0;
        int sub ;
        for(int i: arr){
            if(i%2==0){
                evensum += i;
               
                even++;
            }
            else{
                oddsum += i;
              
                odd++;
            }
        }
        System.out.println(Math.abs(evensum-oddsum));
        

        int[] oddarr = new int[odd];   
        int[] evenarr = new int[even];

        
        int oddindex = 0;
        int evenindex = 0;
        for(int a=0; a <= arr.length-1; a++){
            if(arr[a]%2==0) evenarr[evenindex++] = arr[a];
            else oddarr[oddindex++] = arr[a];
        }

        for(int j: evenarr) 
            System.out.print(j+" ");
        System.out.println();
        for(int k: oddarr){  
            System.out.print(k+" ");
        }

    }
}
