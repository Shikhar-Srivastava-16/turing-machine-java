import java.util.Random;

public class cell {

    Random random = new Random();
    //attributes
    private static final char[] possibleValues = {0, 1};
    private char value;

    public boolean validVal(char char1) {

        //checks a
        for (int i = 0; i < possibleValues.length; i++) {
            if (possibleValues[i] == char1) {
                return true;
            }
        }
        return false;
    }

    public cell(){
        int temp = random.nextInt() % possibleValues.length;
        this.value = (char)(temp);
    }

    public cell(char value) {
        if (validVal(value)) {
            this.value = value;
        } else {
            System.out.println("Invalid value for cell");
        }
    }

    //getter and setter for value
    public void setValue(char value) {
        if (validVal(value)) {
            this.value = value;
        } else {
            System.out.println("Invalid setting for value");
        }
    }

    public char getValue() {
        return value;
    }

}