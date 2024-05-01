//package caesar;
//
//public class soal11 {
//    public static String main(String[] args) {
////        String plainText;
////        int shift;
////
////        if (shift>26){
////            shift = shift%26;
////    } else if (shift<0) {
////            shift = (shift%26)+26;
////        }
////        String cipherText = " ";
////        int length = plainText.length();
////        for (int i = 0; i<length; i++){
////            char ch = plainText.charAt(i);
////            if (Character.isLetter((ch))){
////                if(Character.isLowerCase(ch)){
////                    char c = (char) (ch+shift);
////                    if (c>'z'){
////                        cipherText += (char)(ch - (26-shift));
////                    } else {
////                        cipherText += c;
////                    }
////
////                } else if (Character.isUpperCase(ch)) {
////                    char c = (char) (ch+shift);
////                    if (c>'Z'){
////                        cipherText += (char)(ch - (26-shift));
////                    } else {
////                        cipherText += c;
////                    }
////                }
////            }
////            else {
////                cipherText += ch;
////            }
////        }
////        return cipherText;
//
////        String text = "SEPULSA OKE";
////        String cipher = encrypt(text, 12);
////        System.out.println(cipher);
//
//    }
//}
