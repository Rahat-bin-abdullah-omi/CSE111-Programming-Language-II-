public class Lab01_Part01_Task13{
    public static int [] removeOdd (int [] input){
        int evenCount=0;
        for(int i=0; i<input.length; i++){
            if(input[i]%2==0){
                evenCount++;
            }
        }
        int[] newArray= new int[evenCount];
        int count=0;
        for(int i=0; i<input.length; i++){
            if(input[i]%2==0){
                newArray[count]=input[i];
                count++;
            }
        }
        return newArray;
    }
    public static void main(String [] args){
        int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
        for (int i = 0; i<mixedArray.length; i++) {
            System.out.print(mixedArray[i] + " ");
        }
        System.out.println();
        int [] noOdd = removeOdd(mixedArray);
        for (int i = 0; i < noOdd.length; i++) {
            System.out.print(noOdd[i] + " ");
        }
    }
}