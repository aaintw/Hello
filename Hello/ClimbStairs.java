
import java.util.HashMap;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AA
 */
public class ClimbStairs {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    public int climbStairs(int n) {
        if(n == 0 || n ==1){
            return 1;
        }        
        if(hm.containsKey(n)){
            return hm.get(n);
        }
        int num = climbStairs(n-1)+climbStairs(n-2);
        return num;
    }
}
