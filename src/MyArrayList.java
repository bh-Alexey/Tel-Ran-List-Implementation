import java.util.Arrays;
public class MyArrayList {

        private int[] array;
        private int size;

        public MyArrayList(){
            array = new int[10];
        }

        public void add(int value) {
            if (size == array.length) {
                grow();
            }
            array[size] = value;
            size++;
        }

        private void grow() {
            int[] newArray = new int[array.length * 2];

            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        public boolean contains(int element) {
            for (int i = 0; i < size; i++) {
                if (array[i] == element) {
                    return true;
                }
            }
            return false;
        }

        public int size() {
            if (array == null) {
                return 0;
            }
            int size = 0;
            for (int i = 0; i < size; i++) {
                size = (array[i] != 0) ? ++size : size;
            }
            return size;
        }

        public void add(int index, int value) {
            if (size == array.length) {
                grow();
            }

            int lastIndex = size - 1;
            for (int i = lastIndex; i >= index; i--) {
                array[i + 1] = array[i];
            }

            array[index] = value;
            size++;
        }

        public void remove(int index){
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = 0;
            size--;
        }

        public void trimToSize() {
            int[] newArray = new int[size];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        @Override
        public String toString() {
            return "MyArrayList{" +
                    "array=" + Arrays.toString(array) +
                    ", size=" + size +
                    '}';
        }
}
