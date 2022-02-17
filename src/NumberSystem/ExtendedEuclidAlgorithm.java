package NumberSystem;

class Triplet{
    int x;
    int y;
    int gcd;
}
public class ExtendedEuclidAlgorithm {
    public static Triplet extendedEuclid(int a, int b){
        if(b == 0){
            Triplet ans = new Triplet();
            ans.gcd = a;
            ans.x = 1;
            ans.y = 0;
            return ans;
        }
        // Extended Euclid Algorithm
        Triplet smallAns = extendedEuclid(b, a % b);
        Triplet ans = new Triplet();
        ans.gcd = smallAns.gcd;
        ans.x = smallAns.y;
        ans.y = smallAns.x - (a/b)* smallAns.y;
        return ans;
    }
    public static void main(String []args){
        int a = 16;
        int b = 10;
        Triplet ans = extendedEuclid(a, b);
        System.out.println(ans.gcd + " "  + ans.x + " " + ans.y);
    }
}
