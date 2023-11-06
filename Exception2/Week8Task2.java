import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8Task2 {
    /**
     * nullPointerEx.
     */
    public void nullPointerEx() throws NullPointerException {
        String s = null;
        System.out.println(s.toString());
    }

    /**
     * arrayIndexOutOfBoundsEx.
     */
    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        int[] a = new int[2];
        System.out.println(a[3]);
    }

    /**
     * arithmeticEx.
     */
    public void arithmeticEx() throws ArithmeticException {
        int x = 2 / 0;
    }

    /**
     * fileNotFoundEx.
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        FileReader fileReader = new FileReader("exception2.txt");
    }

    /**
     * ioEx.
     */
    public void ioEx() throws IOException {
        FileReader fileReader = new FileReader("exception2.txt");
    }

    /**
     * nullPointerExTest.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
            return "Không có lỗi";
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
    }

    /**
     * arrayIndexOutOfBoundsExTest.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
            return "Không có lỗi";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
    }

    /**
     * arithmeticExTest.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
            return "Không có lỗi";
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
    }

    /**
     * fileNotFoundExTest.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
            return "Không có lỗi";
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
    }

    /**
     * ioExtest.
     */
    public String ioExTest() {
        try {
            ioEx();
            return "Không có lỗi";
        } catch (IOException e) {
            return "Lỗi IO";
        }
    }
}
