//import java.util.HashMap;

//public class Solution {
   // public int[] twoSum(int[] nums, int target) {
        //HashMap<Integer, Integer> seen = new HashMap<>();
        //for (int i = 0; i < nums.length; i++) {
            //int complement = target - nums[i];
            //if (seen.containsKey(complement)) {
                //return new int[] { seen.get(complement), i };
            //}
            //seen.put(nums[i], i);
        //}
        //return null;
    //}
//}
// EL DE ANTES ES DE JEIMI EL QUE SIGUE ES EL MIO....
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> checkinglist = new HashMap<>();
        for (int i=0; i< nums.length; ++i){    
        int n = nums[i];
        int diff = target - n;
        if (checkinglist.containsKey(diff)){
            return new int[]{checkinglist.get(diff),i};
        }
        checkinglist.put(n,i);
    }
    return null;
    }

// no es la forma que va a servir con leets code.voy a hacer la otra opcion. creo que es porque no me dejan usar Arraylist y por ende no puedo usar size o get
    //public int removeElement(ArrayList<Integer> nums, int val){
      //  int i = 0;
        //while (i < nums.size()) {
          //  if (val == nums.get(i)){
            //    nums.remove(i);
            //}else{
             //   i++;
            //}
            
        //}
        //return nums.size();
    
        //}
    public int removeElement(int[] nums, int val){
        int k=0;
        for (int i=0; i < nums.length;i++){
           if(nums[i] !=val){
            nums[k] = nums[i];
            k++;
           } 
        }
        return k;
    }


    }