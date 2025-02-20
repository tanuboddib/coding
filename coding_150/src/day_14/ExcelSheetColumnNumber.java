package day_14;

public class ExcelSheetColumnNumber {

	public int titleToNumber(String columnTitle) {
        int num = 0;
        int len = columnTitle.length();
        int i = len-1;
        int k = 1;
        while(i >= 0){
            num += ((columnTitle.charAt(i)-'A' + 1)*k);
            k *= 26;
            i--;
        }
        //num += columnTitle.charAt(len-1) - 'A' + 1;

        return num;
    }
	
}
