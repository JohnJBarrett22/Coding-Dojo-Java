public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        String newString = str1.trim() + str2.trim();
        return newString;
    }
    public Integer getIndexOrNull(String someStr, char someChar) {
        Integer value = someStr.indexOf(someChar);
        return value;
    }
    public Integer getIndexOrNull(String aString, String subString) {
        Integer value = aString.indexOf(subString);
        return value;
    }
    public String concatSubstring(String str1, int int1, int int2, String str2) {
        String str3 = str1.substring(int1, int2);
        String finalString = str3 + str2;
        return finalString;
    }









}
