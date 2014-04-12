# ANTLR Example Parser

This repository is an example of a minimal ANTLR
parser that works.

It is a silly test parser for a language about soup.

I don't know much about parsing so there might be parts
of this that are weird, like building the soup from
the syntax tree.

This repo includes:

- An eclipse project
- An ANTLR 4 grammar file in `/src/souplang/grammar/Soup.g4`
- An example junit test suite in `/src/souplang/grammar/tests/SoupGrammarTest.java`
- A factory that builds a `Soup` instance from a parsed tree in `/src/souplang/grammar/SoupFactory.java`
- A usage example in `/src/souplang/Main.java`

This is the salient part of the parser:

~~~ANTLR
    BOWLSTART : 'bowl' ;
    MODIFIER : 'hot' | 'mild' | 'gross' ;
    RAWINGREDIENT : 'onion' | 'eggs' | 'peppers' ;
    WHITESPACE : [ \t\r\n]+ -> skip ;

    soup : BOWLSTART ingredient+ ;
    ingredient : modifier? rawingredient ;
    modifier : MODIFIER ;
    rawingredient : RAWINGREDIENT ;
~~~

