package homeWork3;

import java.util.Arrays;
import java.util.Random;

public class homeworker {
    public static void main(String[] args) {

        Random R = new Random();
        int[][] array = new int[5][5];
        System.out.println("Не сортированый массив");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = R.nextInt(10);

            }
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Сортированный массив");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = j + 1; k < array[i].length; k++) {
                    if (array[i][j] > array[i][k]) {
                        int b = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = b;
                    }
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }


       /* @Test
        public void test () {
            List<String> one = Arrays.asList("four", "two", "three");
            List<String> two = Arrays.asList("one", "two", "three");
            one.set(0, "one");
            assertEquals(one, two, "Списки равны");
        }
        @Test
        public void test2 () {
            List<String> one1 = Arrays.asList("three", "one", "two");
            List<String> two2 = Arrays.asList("one", "two", "three");
            assertNotSame(one1.indexOf("one"), two2.indexOf("one"), "Списки равны");
        }*/
    }
}
