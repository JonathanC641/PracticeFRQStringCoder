import java.util.ArrayList;

public class StringCoder {

    private String masterString;

    /** Precondition: the master string contains all the letters of the alphabet
     */
    public StringCoder(String master)
    { masterString = master; }

    /** @param parts an ArrayList of string parts that are valid in the master string
     * Precondition: parts.size() > 0
     * @return the string obtained by concatenating the parts of the master string
     */
    public String decodeString(ArrayList<StringPart> parts)
    {
        String totalWord = "";
        for(int i = 0; i < parts.size(); i++){
            int start = parts.get(i).getStart();
            int length = parts.get(i).getLength();
            totalWord += masterString.substring(start,start+length);
        }
        return totalWord;
    }


    /** @param str the string to encode using the master string
     * Precondition: all the characters in str appear in the master string;
     *               str.length() > 0
     * @return a string part in the master string that matches the beginning of str.
     * The returned string part has length at least 1.
     */
    private StringPart findPart(String str) {
        // THIS METHOD'S IMPLEMENTATION WAS NOT SHOWN ON THE FRQ
        // BUT IS BEING PROVIDED HERE FOR TESTING PURPOSES
        int start = 0;
        int length = 0;
        for (int len = 1; len <= str.length(); len++) {
            int found = masterString.indexOf(str.substring(0, len));
            if (found != -1) {
                start = found;
                length = len;
            }
        }
        return new StringPart(start, length);
    }


    /** @param word the string to be encoded
     * Precondition: all the characters in word appear in the master string;
     * word.length() > 0
     * @return an ArrayList of string parts of the master string that can be combined
     * to create word
     */
    public ArrayList<StringPart> encodeString(String word)
    {
        ArrayList<StringPart> parts = new ArrayList<StringPart>();
        StringPart p = findPart(word);
        while(p.getLength() != 0){
            parts.add(p);
            word = word.substring(p.getLength());
            p = findPart(word);
        }
        return parts;
    }
}
