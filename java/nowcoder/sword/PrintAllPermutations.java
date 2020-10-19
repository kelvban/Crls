/**
 * Print all permutations of characters in the string in dictionary order
 */

package nowcoder.sword;
import java.util.ArrayList;
import java.util.TreeSet;
class PrintAllPermutations{
    public ArrayList<String> strList = new ArrayList<>();
    public TreeSet<String> treeList = new TreeSet<>();
 
    public ArrayList<String> Permutation(String str) {
       if (str == null || str.length() <= 0)
           return strList;
        Permutation(str.toCharArray(), 0);
        for (String s : treeList)
            strList.add(s);
        return strList;
    }
 
    public void Permutation (char[] str, int index) {
        int length = str.length;
        if (index == length - 1)
            treeList.add(String.valueOf(str));
        else {
            for (int i = index; i < length; ++i) {
                swap(str, index, i);
                Permutation(str, index + 1);
                swap(str, index, i);
            }
        }
    }
 
    public void swap(char[] str, int a, int b) {
        char temp = str[a];
        str[a] = str[b];
        str[b] = temp;
    }
    
    public static void main(String[] args) {
        String str="abc";
        PrintAllPermutations printAllPermutations=new PrintAllPermutations();
        ArrayList<String> result=printAllPermutations.Permutation(str);
        for(String s : result){
            System.out.println(s);
        }
    }
}