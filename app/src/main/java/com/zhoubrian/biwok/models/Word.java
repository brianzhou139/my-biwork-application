package com.zhoubrian.biwok.models;

public class Word {

    /*default translation of the word.......*/
    private String defaultWord;
    private String translationWord;

    public int getDigit() {
        return digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }

    private int digit;

    public Word(String defaultWord, String translationWord) {
        this.defaultWord = defaultWord;
        this.translationWord = translationWord;
    }

    public Word(String defaultWord, String translationWord, int digit) {
        this.defaultWord = defaultWord;
        this.translationWord = translationWord;
        this.digit = digit;
    }

    public String getDefaultWord() {
        return defaultWord;
    }

    public void setDefaultWord(String defaultWord) {
        this.defaultWord = defaultWord;
    }

    public String getTranslationWord() {
        return translationWord;
    }

    public void setTranslationWord(String translationWord) {
        this.translationWord = translationWord;
    }

}//end of Word...
