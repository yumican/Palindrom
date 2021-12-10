
public class Ex {
    static boolean isPalindrom(int number)
    {
        int temp = number, reverse, last;
        reverse = 0;
        while(temp != 0){
            int a = temp % 10;
            reverse = (reverse * 10) + a;
            temp/=10;
        }
        if ( number != reverse) {
            return false;
        }
        return true;
    }
public static void main(String[]args){

    System.out.println(isPalindrom(1234));
    System.out.println(isPalindrom(101));
    System.out.println(isPalindrom(1230321));





}


}