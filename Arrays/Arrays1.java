

public class Assignment2{

    public static void main(String[] args){
  
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=obj.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int c=0;
        System.out.println("Enter the elements of array 1:");
        for(int i=0;i<n;i++){
         int a;
         a= obj.nextInt();
          arr1[i]=a;
        }
        System.out.println("Elements of array 1 are:-");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Enter the elements of array 2:");
        for(int i=0;i<n;i++){
            int a;
            a= obj.nextInt();
            arr2[i]=a;
        }
        System.out.println("Elements of array 2 are:-");
        for(int i=0;i<n;i++){
            System.out.print(arr2[i] + " ");
        }
        int arr3[]= new int[arr1.length + arr2.length];
        for (int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
            c++;
        }
        for (int i=0;i<arr2.length;i++){
            arr3[c++]=arr2[i];
        }
        System.out.println();
        System.out.println("Elements of merged array are: ");
        for (int i=0;i<arr3.length;i++){
            System.out.print(arr3[i] + " ");
        }
    }
}
