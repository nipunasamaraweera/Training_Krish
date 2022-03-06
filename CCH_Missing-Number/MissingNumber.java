import java.util.Scanner;

class MissingNumber {

   
    public static void main(String args[]){
        
        
        System.out.println("Please enter a series of numbers devided by ,");
        
        Scanner n = new Scanner(System.in);
        String numseq = n.next();
        String[] list = numseq.split(","); 

        int size = list.length; 
        int [] Arr = new int [size];  
        for(int i=0; i<size; i++) {
            Arr[i] = Integer.parseInt(list[i]);
         }

       
        bubbleSort(Arr);

        
        int missNum = 0, count = 0; 
        int c = Arr[0]; 
        for(int i = 0 ; i<size ; i++){

            if(Arr[i] == c){
                
            } 
            else {
                missNum = c;
                count++;
            }           
            c = Arr[i] + 1;  
            
        }

        
        if (count == 1){
            System.out.println("Missing number is " + missNum);
        }
        else if (count > 1){
            System.out.println("There are many missing numbers in the sequence series.");
        }
        else {
            System.out.println("No missing numbers in the sequence");
        }
            
    }
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){   
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    } 
}