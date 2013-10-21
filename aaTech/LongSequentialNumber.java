
import java.util.HashSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Need to modify
 * @author AA
 */
public class LongSequentialNumber {
        public int longestConsecutive(int[] num) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < num.length;i++){
            if(!hs.contains(num[i])){
                hs.add(num[i]);
            }
        }
        int max_max = 1;
        for(int i = 0; i < num.length;i++){
            if(!hs.contains(num[i])){
                continue;
            }
            int max = 1;
            for(int j = 1; j < num.length; j++){
                if(hs.contains(num[i]+j)){
                    hs.remove(num[i]+j);
                    max ++;
                }else{
                    break;
                }
            }
            for(int j = 1; j < num.length; j++){
               if(hs.contains(num[i]-j)){
                    hs.remove(num[i]-j);
                    max++;
                }
                else{
                    break;
                }
            }
            if(max > max_max){
                max_max = max;
            }
        }
        return max_max;
    }
}
