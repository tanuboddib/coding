package day_15;

public class AddBinary {

	public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        while(i >= 0 || j >= 0){
            char ch1 = i >= 0 ? a.charAt(i) : '0';
            char ch2 = j >= 0 ? b.charAt(j) : '0';
            if(ch1 == '1' && ch2 == '1'){
                if(carry == 1){
                    sb.append('1');
                }
                else{
                    sb.append('0');
                    carry = 1;
                }
            }
            else if(ch1 == '1' || ch2 == '1'){
                if(carry == 1){
                    sb.append('0');
                }
                else{
                    sb.append('1');
                }
            }
            else{
                if(carry == 1){
                    sb.append('1');
                    carry = 0;
                }
                else{
                    sb.append('0');
                }
            }
            i--;
            j--;
            //System.out.println(sb.toString());
        }
        if(carry > 0){
            sb.append('1');
        }
        return sb.reverse().toString();
    }
	
}
