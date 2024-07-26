package com.exampletest.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * queres saber quien es palindromo?
 */
@RestController
public class PalindromeController {

    /**
     *
     * @param word la palabra a verificar
     * @return Un mensaje identificando palindromo
     */
    @GetMapping("/palindrome/{word}")
    public String Palindrome(@PathVariable String word) {
        if(isPalindrome(word)) {
            return "La palabra " + word +  " SI es un palindromo";
        }
        return "La palabra " + word +  " NO es un palindromo";
    }

    private boolean isPalindrome(String word) {
        int length = word.length();
        for(int i=0; i<length/2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
