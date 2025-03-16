import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        double[] secondArr = {1.57, 7.654, 9.986};
        int[] thirdArr = {4, 5, 6, 7, 8};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(secondArr));
        System.out.println(Arrays.toString(thirdArr));

        for (int index = (arr.length - 1); index >= 0; index--) {
            if (index == 0) {
                System.out.println(arr[index]);
                break;
            }
            System.out.print(arr[index] + ", ");
        }
        for (int secondIndex = (secondArr.length - 1); secondIndex >= 0; secondIndex--) {
            if (secondIndex == 0.0) {
                System.out.println(secondArr[secondIndex]);
                break;
            }
            System.out.print(secondArr[secondIndex] + ", ");
        }
        for (int thirdIndex = (thirdArr.length - 1); thirdIndex >= 0; thirdIndex--) {
            if (thirdIndex == 0) {
                System.out.println(thirdArr[thirdIndex]);
                break;
            }
            System.out.print(thirdArr[thirdIndex] + ", ");
        }

        for (int fourthIndex = 0; fourthIndex <= thirdArr.length - 1; fourthIndex++) {
            if (thirdArr[fourthIndex] % 2 != 0) {
                System.out.print((thirdArr[fourthIndex] + 1) + " ");
            } else {
                System.out.print(thirdArr[fourthIndex] + " ");
            }
        }

    }
}