import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AmortizedTimeComplexity {

    public static void main(String[] args) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final DynamicArray dynamicArray = new DynamicArray();
        int input = Integer.parseInt(bufferedReader.readLine());
        while(input != -1){
            dynamicArray.add(input);
            input = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println(dynamicArray);
    }
}

class DynamicArray {
    private int size = 1;
    private int counter = 0;
    private int arr[] = new int[size];

    public void add(int element) {
        if(counter == size){
            System.out.println("Doubling the Size");
            size = 2 * size;
            final int tempArr[] = new int[size];
            /*for(int i=0; i<arr.length; i++){
                tempArr[i] = arr[i];
            }*/
            System.arraycopy(arr, 0, tempArr, 0, arr.length);
            arr = tempArr;
        }
        arr[counter] = element;
        counter++;
    }

    @Override
    public String toString() {
        return "Size = " + size +
                ", arr = " + Arrays.toString(arr) +
                ", counter = " + counter;
    }
}

