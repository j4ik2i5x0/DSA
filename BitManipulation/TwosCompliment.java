package BitManipulation;

public class TwosCompliment {
    public static void main(String[] args) {
        String bin = "1101";

        String onesComp = "";
        for(int i = 0; i < bin.length(); i++){
            if(bin.charAt(i) == '1') {
                onesComp += '0';
            } else {
                onesComp += '1';
            }
        }

        String twosComp = "";
        int carry = 1;
        for(int i = onesComp.length() - 1; i >= 0; i--) {
            char bit = onesComp.charAt(i);

            if(bit == '1' && carry == 1) {
                twosComp = '0' + twosComp;
            } else if(bit == '0' && carry == 1) {
                twosComp = '1' + twosComp;
                carry = 0;
            } else {
                twosComp = bit + twosComp;
            }
        }

        
        
        System.out.println("Original: " + bin);
        System.out.println("One's Complement: " + onesComp);
        System.out.println("Two's Complement: " + twosComp);

        
    }
}
