public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator finalstring = new StringManipulator();
        String result = finalstring.trimAndConcat("         Good     ", "   Dog          ");
        System.out.println(result);

        StringManipulator testindex = new StringManipulator();
        Integer finalvalue = testindex.getIndexOrNull("I like to eat chicken under the pale moon light.", 'u');
        System.out.println(finalvalue);

        StringManipulator findSubString = new StringManipulator();
        Integer finalValue = findSubString.getIndexOrNull("I like to eat chicken under the pale moon light.", "ken");
        System.out.println(finalValue);

        StringManipulator combineString = new StringManipulator();
        String endResult = combineString.concatSubstring("I like to eat chicken under the pale moon light.", 10, 13, "cheese");
        System.out.println(endResult);
    }
}