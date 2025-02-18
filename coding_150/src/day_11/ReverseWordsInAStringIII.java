package day_11;

public class ReverseWordsInAStringIII {
	
	public String reverseWords(String s) {
        String[] str = s.trim().split(" ");
        int len = str.length;
        int i = len-1;
        StringBuilder sb = new StringBuilder();
        while(i >= 0){
            if(str[i].trim().length() != 0){
                sb.append(str[i] + " ");
            }
            i--;
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
	
	/*
	 * public String reverseWords(String s) {

        StringBuilder solution = new StringBuilder();

        char[] charString = s.toCharArray();
        int currEnd = -1;
        boolean wordGoing = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                if (!wordGoing) {
                    currEnd = i;
                    wordGoing = true;
                }
            }

            if (s.charAt(i) == ' ') {
                if (currEnd != -1) {
                    solution.append(s.substring(i + 1, currEnd + 1)).append(" ");
                    wordGoing = false;
                    currEnd = -1;
                }
            }
        }

        if (currEnd != -1) {
            solution.append(s.substring(0, currEnd + 1)).append(" ");
        }

        return solution.length() > 0 ? solution.substring(0, solution.length() - 1) : "";
    }
	 * 
	 * */
	

}
