package souplang;

import souplang.grammar.SoupFactory;

public class Main {
    public static void main(String[] args) {
        String input = "bowl hot peppers eggs mild onion";
        Soup s = SoupFactory.parse(input);
        System.out.println(s);
    }
}
