package com.github.wangzisfa.offer;

/**
 * Description:
 * <p>
 * date: 2022/01/05
 * <p>
 *
 * @author wangzisfa
 */
public class Offer05 {
    public static void main(String[] args) {
        System.out.println(Offer05.replaceSpace1("we are happy"));
    }
    
    //emm 彳亍
    public String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }
    
    // substring区间: [)
    // 并且区间应该是s.length()
    public static String replaceSpace1(String s) {
        String left;
        String right;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                left = s.substring(0, i);
                left += "%20";
                right = s.substring(i + 1);
//                System.out.println("current left : " + left);
//                System.out.println("current right : " + right);
                s = left + right;
                i += 3;
            }
        }
        return s;
    }
    
    //直接重新替换
    
    /**
     * @param s s
     * @return
     *
     * 到底用 {@link StringBuilder} 还是用 {@link StringBuffer}
     * 直接看区别
     */
    public static String replaceSpace2(String s) {
        StringBuilder sb = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (c.equals(' ')) {
                sb.append("%20");
            } else sb.append(c);
        }
        
        return String.valueOf(sb);
    }
}
