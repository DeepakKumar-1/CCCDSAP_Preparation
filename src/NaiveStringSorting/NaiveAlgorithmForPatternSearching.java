package NaiveStringSorting;

public class NaiveAlgorithmForPatternSearching {
    public static void patternMatch(char []txt, char []pat){
        int i = 0;
        int j = pat.length - 1;
        while(j < txt.length){
            int k=0;
            int count = 0;
            for(int index = i; index<=j; index++){
                if (txt[index] == pat[k]){
                    count++;
                    k++;
                } else{
                    break;
                }
            }
            if(count == pat.length){
                System.out.println("Pattern Found at: " + i);
            }
            // update i and j
            i += 1;
            j += 1;
        }
    }
    public static void main(String []args){
//        char []txt = "THIS IS A TEST TEXT".toCharArray();
//        char []pat = "TEST".toCharArray();
        char []txt = "AABAACAADAABAABA".toCharArray();
        char []pat = "AABA".toCharArray();
        // Display All Matches
        patternMatch(txt, pat);
    }
}
