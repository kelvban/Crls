package nowcoder.sword;
import java.util.Queue;
import java.util.LinkedList;
import java.lang.Character;
class FirstNoRepeatChar{
    int[] charCnt = new int[128];
    Queue<Character> queue = new LinkedList<Character>();
 
    //Insert one char from stringstream
    public void Insert(char ch) {
        if (charCnt[ch]++ == 0) //新来的单身字符，入队
            queue.add(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        Character CHAR = null;
        char c = 0;
        while ((CHAR = queue.peek()) != null) {
            c = CHAR.charValue();
            if (charCnt[c] == 1) //判断是否脱单了，没脱单则输出
                return c;
            else queue.remove(); //脱单了就移出队列，它不会再回来了
        }
        return '#'; //队空，返回#
    }
}