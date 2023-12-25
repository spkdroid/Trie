package org.spkd.trie;

import org.spkd.trie.data.TrieNode;
import org.spkd.trie.impl.ITrie;

public class Trie implements ITrie {

    private final TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    @Override
    public void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            current.children.putIfAbsent(ch, new TrieNode());
            current = current.children.get(ch);
        }
        current.isEndOfWord = true;
    }

    @Override
    public boolean search(String word) {
        TrieNode current = root;

        for (char ch : word.toCharArray()) {
            if (!current.children.containsKey(ch)) {
                return false;
            }
            current = current.children.get(ch);
        }
        return current.isEndOfWord;
    }
}
