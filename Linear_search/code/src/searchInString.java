public class searchInString {
    public static void main(String[] args) {
        String name = "Ayush";
        char target = 'p';
        System.out.println(SearchString(name, target));

    }
    static boolean SearchString(String str, char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
        }
}
