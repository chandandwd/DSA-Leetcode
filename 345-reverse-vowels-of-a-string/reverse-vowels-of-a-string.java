class Solution {
    public String reverseVowels(String s) {
       char[] arr = s.toCharArray();
       String vowel = "AEIOUaeiou";
       int j = 0, k = arr.length - 1;

       while(j < k){
           if(vowel.contains(arr[j] + "" ) && !vowel.contains(arr[k] + "")) {
               k--;
           } 
           else if(!vowel.contains(arr[j] + "" ) && vowel.contains(arr[k] + "")) {
               j++;
           } 
           else if(vowel.contains(arr[j] + "" ) && vowel.contains(arr[k] + "")) {
               char temp = arr[j];
               arr[j] = arr[k];
               arr[k] = temp;
               j++;
               k--;
           } 
           else {
               j++;
               k--;
           }
       }

       return new String(arr);
    }
}