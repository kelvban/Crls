/**
 * Regular expression to match String 
 */
package nowcoder.sword;

public class RegularExpression {
    public boolean match(char[] str, char[] pattern)
    { 
        return new String(str).matches(new String(pattern).replace(".", "\\w"));
    }
}