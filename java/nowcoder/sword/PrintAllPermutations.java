/**
 * Print all permutations of characters in the string in dictionary order
 */

 /**
  * 可以将字符串分为两个部分，
  第一个字符和剩下其他的字符，
  先确定第一个字符的所有可能结果，
  即先与自身交换再剩下的其他字符逐一交换，
  每交换完一次就相当于确定了一个字符，
  接着需要确定下一个字符即第二个字符，
  让它再与自身交换然后与它之后的字符逐一交换…
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