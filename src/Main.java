import reverse_polish_notation.EvalReversePolishNotation;
import rotate_array.RotateArray;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

       /* RotateArray rotateArray = new RotateArray();
        printArr(
                rotateArray.rotate(arr,2)
        );*/

     /*   String [] items = {"2", "1", "+", "3", "*"}; // -> ((2 + 1) * 3) -> 9
       int result =  EvalReversePolishNotation.evalPPN(items);
       System.out.println(result);*/


    }


    private static int currentIndex(int [] arr , int item){
        int index = 0;
        for(int i = 0 ; i< arr.length ; i++){
            if (arr[i] == item)
                index = i;
        }
        return index;
    }

    static void printArr(int [] items){
        System.out.print("[");
        for(int x : items){
            System.out.print(x + ",");
        }
        System.out.println("]");

    }
}

