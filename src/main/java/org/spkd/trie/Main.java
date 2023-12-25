package org.spkd.trie;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("banana");

        System.out.println(trie.search("apple"));   // true
        System.out.println(trie.search("apples"));  // false
        System.out.println(trie.search("app"));     // true
        System.out.println(trie.search("banana"));  // true
        System.out.println(trie.search("ban"));     // false
    }
}