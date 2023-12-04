package BT_041223;

public class App {
    public static void main(String[] args) {
        int[] arr = {7,6,0,2,3,5,4,9,8,1};
        String s = "This is my test";
        
        max(arr);
        increaseArray(arr);
        reverseArray(arr);

        sumPrime(10);
        UCLN(17, 28);
        BCNN(17,28);
        Square(5);

        isPrime(10);
        isPrime(247);
        reverseString(s);
        sum_of_number(15784930);
        
        increaseSort(arr);
        Max_k(arr, 4);
        Max_k(arr, 1);
        primeArray(arr);
    }

    public static void max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max of Array: " + max);
    }

    public static void increaseArray(int[] arr){
        int count = -1;
        for (int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                count++;
            }

        }
        if(count == -1){
            System.out.println("Increasing Array: ");
        } else{
            System.out.println("Not increasing Array: ");
        }
    }

    public static void reverseArray(int[] arr){
        int first = 0;
        int last = arr.length -1;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = arr[first];
            first++;
            last--;
        }
           System.out.println("After reverse: "); 
           for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " , ");
           }
        }

        public static void Square(int h){
            
            for (int i = 0; i < h; i++){
                for (int j = i+1; j < h+1; j++){
                    System.out.println("*");
                }
            }
        }
        public static void sumPrime(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            int count = 0;
        for(int j=1;j<=i;j++){
            if(i%j==0){
                count++;
            }
        }
        if (count == 2){
            sum +=i; 
        } 
        }
        System.out.println("Sum of prime " + sum);
    }
    public static void UCLN(int a, int b){
        if(a>=b){
            for(int i=b;i>=1;i--){
                if(a%i==0 && b%i==0){
                    System.out.println("UCLN " + i);
                    break;
                }
            }
        } else {
            for(int i=a;i>=1;i--){
                if(a%i==0 && b%i==0){
                    System.out.println("UCLN " + i);
                    break;
                }
            }
        }
    }

    public static void BCNN(int a, int b){
        int i = 1;
        if (a<=b) {
            while ((a*i)%b != 0) {
                i++;
            }
            System.out.println("BCNN: " + (a*i));
        } else {
            while((b*i)%a != 0) {
                i++;
            }
            System.out.println("BCNN: " + (b*i));
        }
            
        
    }
    
    public static void isPrime(int a){
        int count = 0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if (count == 2){
            System.out.println(a + " is a Prime");
        } else {
            System.out.println(a + " is not a Prime");
        }
    }

    

    

    public static void reverseString(String s){
        int index = 0;
        char[] arr = new char[s.length()];
        for(int i=s.length()-1;i>=0;i--){
            arr[index] = s.charAt(i); 
            index++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }

    public static void sum_of_number(int a){
        int sum = 0;
        
        while (a>10) {
            sum += a%10;
            a = (a - a%10)/10;
        }
        sum +=a;
        System.out.println("Sum of the number: " + sum);
    }

    public static void increaseSort(int[] arr){
        for(int i=0; i<arr.length -1;i++){
            for(int j = 0; j < arr.length -1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("new Sort array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void Max_k(int[] arr,int k){
        if(k>arr.length || k<=0){
            System.out.println("Wrong!");
        } else{
            increaseSort(arr);
            System.out.println(arr[arr.length - k]);
        }
    }

    public static void primeArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            isPrime(arr[i]);
        }
    }
    

}
