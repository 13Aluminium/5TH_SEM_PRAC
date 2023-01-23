public class SearchInString {
    public static void main(String[] args) {
        String name = "Ayush";
        char target = 'x';
        System.out.println(search(name, target));
    }
//    static boolean search(String ste,char target){
//        if(ste.length()==0){
//            return false;
//        }
//        for(int i=0;i<ste.length();i++){
//            if(target ==ste.charAt(i)){
//                return true;
//            }
//        }
//        return false;
//    }


    //OR
    static boolean search(String ste, char target) {
        if (ste.length() == 0) {
            return false;
        }
        //for very character in my to string char array
        for (char ch : ste.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}

