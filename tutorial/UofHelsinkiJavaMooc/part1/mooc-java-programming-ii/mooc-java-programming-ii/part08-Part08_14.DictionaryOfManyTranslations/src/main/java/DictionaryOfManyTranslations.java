/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixiangzhang
 */
import java.util.HashMap;
import java.util.ArrayList;
        
public class DictionaryOfManyTranslations {
    // attributes
    private HashMap<String, ArrayList<String>> dictionaries;
    // constructors
    public DictionaryOfManyTranslations() {
        this.dictionaries = new HashMap<>();
    }
    
    // methods
    public void add(String word, String translation) {
        // if key space does contain the key "word"
        if (this.dictionaries.containsKey(word)) {
            this.dictionaries.get(word).add(translation);
            return;
        }
        // if it doesn't contain the word yet, we initialize an array and put it
        ArrayList<String> translations = new ArrayList<>();
        translations.add(translation);
        
        this.dictionaries.put(word, translations);
    }
    
    public ArrayList<String> translate(String word) {
        if (this.dictionaries.containsKey(word)) {
            return this.dictionaries.get(word);
        }
        // doesn;t have it
        return new ArrayList<String>();
    }
    
    public void remove(String word) {
        this.dictionaries.remove(word);
    }
    
}
