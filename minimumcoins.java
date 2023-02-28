import java.util.*;
public class Main
{
    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int remain = 0, minCoins = 0;
        for(int i=coins.length-1;i!=-1;i--) {
            int c = coins[i];
            if(amount==0) {
                break;
            }
            remain = amount % c;
            minCoins += amount/c;
            amount=remain;
        }
        return minCoins;
    }
	public static void main(String[] args) {
	    int[] arr = {3};
		System.out.println(coinChange(arr, 2));
	}
}