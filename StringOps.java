public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
       // String word="vowels are fun";
        // System.out.println(capVowelsLowRest(word));
        // String word="   Intro   to  computer   science    ";
        // System.out.println(camelCase(word));
        //String word="Hello world";
        //allIndexOf(word,'l');
       // String word="Hello world";
        //System.out.println(allIndexOf(word,'l'));
    }

    public static String capVowelsLowRest (String string) {
       String newString="";
       for(int i=0; i < string.length(); i++){
             if("aeiou".indexOf(string.charAt(i))!=-1){
                 newString+=(char)(string.charAt(i)-32);
                } else {
                      newString+=(char)(string.charAt(i));
                     }
         }
        return newString;
    }

    public static String camelCase (String string) {
       String newStr="";
       int firstWord=string.indexOf(' ');
        for(int i=0; i <= firstWord; i++){
            if(string.charAt(i)>='A' && string.charAt(i)<='Z'){
                newStr+=(char)(string.charAt(i)+32);
            }else if(string.charAt(i)!=' '){
                newStr+=(char)(string.charAt(i));
            }
        }
        int j=firstWord;
        while(j < string.length()){
            if(string.charAt(j)>='a' && string.charAt(j)<='z' && string.charAt(j-1)==' '){
                newStr+=(char)(string.charAt(j)-32);
            }else if(string.charAt(j)>='A' && string.charAt(j)<='Z'){
                newStr+=(char)(string.charAt(j)+32);
            }else if(string.charAt(j)>='a' && string.charAt(j)<='z'){
                newStr+=(char)(string.charAt(j));
            }
            j++;
        }
        return newStr;
    }
    public static int[] allIndexOf (String string, char chr) {
        int count=0;
        for(int i=0; i < string.length(); i++){
            if(string.charAt(i)==chr){
                count++;
            }
        }
        int[] arrNew=new int[count];
        int n=0;
        for(int j=0; j < arrNew.length; j++){
                arrNew[j]=string.indexOf(chr, n);
                n=arrNew[j]+1;
        }
        return arrNew;
    }
}
