public class StringPart {
    private int start;
    private int length;

    public StringPart(int start, int length) {
        this.start = start;
        this.length = length;
    }

    public int getStart() {
        return start;
    }

    public int getLength() {
        return length;
    }

    // THIS METHOD WAS NOT SHOWN ON THE FRQ
    // BUT IS BEING PROVIDED HERE FOR TESTING PURPOSES
    public String toString() {
        return "(" + getStart() + ", " + getLength() + ")";
    }
}
