import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String master = "sixtyzipperswerequicklypickedfromthewovenjutebag";
        StringCoder coder = new StringCoder(master);

        ArrayList<StringPart> overeagerParts = new ArrayList<StringPart>();
        overeagerParts.add(new StringPart(37,3));
        overeagerParts.add(new StringPart(14,2));
        overeagerParts.add(new StringPart(46,2));
        overeagerParts.add(new StringPart(9,2));
        System.out.println("--------------------TESTING PART A------------------");
        System.out.println("     decoded arraylist should be: overeager");
        System.out.println("your method decodes arraylist as: " + coder.decodeString(overeagerParts));
        System.out.println("\n--------------------TESTING PART B------------------");
        System.out.println("  'overeager' should be encoded as: " + overeagerParts);
        System.out.println("your method encodes 'overeager' as: " + coder.encodeString("overeager"));

    }
}