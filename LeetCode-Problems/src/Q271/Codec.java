package Q271;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        if(strs.isEmpty()) return (char) 258 + "";
        String key = (char) 257 + "";
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s);
            sb.append(key);
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();

    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        if(s.equals((char) 258+"")) return new ArrayList<>();

        String key = (char) 257 + "";

        return Arrays.asList(s.split(key,-1));
    }

    public static void main(String[] args) {
        var obj = new Codec();
        List<String> strs = Arrays.asList("ab","cd","def");
        String encoded = obj.encode(strs);
        System.out.println("encoded: "+encoded);
        List<String> decode = obj.decode(encoded);
        System.out.println(decode);

    }
}

// Your Codec object will be instantiated and called as such
// Codec codec = new Codec()
// codec. decode(codec. encode (strs));