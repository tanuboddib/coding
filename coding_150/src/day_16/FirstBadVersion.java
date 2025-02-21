package day_16;

public class FirstBadVersion {
	int bad;
	
	public FirstBadVersion(int n) {
		bad = n;
	}
	
	public boolean isBadVersion(int n) {
		if(n >= bad) {
			return true;
		}
		return false;
	}
	
	public int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        int ans = n;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
	
}
