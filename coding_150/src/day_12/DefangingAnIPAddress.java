package day_12;

public class DefangingAnIPAddress {
	
	 public String defangIPaddr(String address) {
	        StringBuilder sb = new StringBuilder();
	        for(char ch: address.toCharArray()){
	            if(ch == '.'){
	                sb.append("[.]");
	            }
	            else{
	                sb.append(ch);
	            }
	        }
	        return sb.toString();
	        //return address.replace(".", "[.]");
	    }

}
