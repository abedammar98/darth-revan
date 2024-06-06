/**
 * @author abe1d
 * @author shahedshalaby
 * The SharedData class encapsulates an integer array, a boolean array,
 * a flag, and a constant integer value. It provides methods to access
 * and modify these fields.
 */
public class SharedData {

    private int[] array;
    private boolean[] winArray;
    private boolean flag;
    private final int b;

    /**
     * Constructs a SharedData object with the specified array and constant integer value.
     *
     * @param array the integer array to be stored
     * @param b the constant integer value
     */
    public SharedData(int[] array, int b) {
        this.array = array;
        this.b = b;
    }

    /**
     * Returns the boolean array winArray.
     *
     * @return the boolean array winArray
     */
    public boolean[] getWinArray() {
        return winArray;
    }

    /**
     * Sets the boolean array winArray.
     *
     * @param winArray the boolean array to be set
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * Returns the integer array array.
     *
     * @return the integer array array
     */
    public int[] getArray() {
        return array;
    }

    /**
     * Returns the constant integer value b.
     *
     * @return the constant integer value b
     */
    public int getB() {
        return b;
    }

    /**
     * Returns the boolean flag.
     *
     * @return the boolean flag
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * Sets the boolean flag.
     *
     * @param flag the boolean flag to be set
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
