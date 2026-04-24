import java.util.*;
class Solution {
    public int furthestDistanceFromOrigin(String s) {
   // if(!s.contains("_")) return 0;
     int cL = 0;
     int cR = 0;
     int max = 0;
     
     for(int i =0; i<s.length(); i++){
        if(s.charAt(i) == 'L') cL++;
        if(s.charAt(i) == 'R') cR++;
     }
     //if(cR == cL && !s.contains("_")) return 0;

     if(cR<cL){
         s = s.replace("_","L");
        }
    else s = s.replace("_","R");

    

    for(int i = 0; i<s.length();i++){
        if(s.charAt(i) == 'L') max -=1; 
        else max +=1;
    }
    if (max<0) return max*(-1);
    return max;

     }  
}
