package com.link.link.flasher;

import android.util.ArrayMap;

import java.util.ArrayList;

/**
 * Created by link on 04.10.14.
 */
public class FlashCard {
    private String mKanji;
    private String mKana;
    private String mTranslation;
    private ArrayList mTags;

    FlashCard(String kanji,String kana, String translation, ArrayList tags) {
        if((null == translation || translation.isEmpty()) || ((null == mKanji || mKanji.isEmpty() )&& (null == mKana || mKana.isEmpty()))) {
            FlashCardConstructorException exception = new FlashCardConstructorException("incomplete flash card initialisation");
        }
        if(null != kanji) mKanji = kanji;
        if(null != kana) mKana = kana;
        mTranslation = translation;
    }

    public class FlashCardConstructorException extends Exception {
        private String mReason;
        public FlashCardConstructorException(String reason){
            mReason = reason;
        }
        public String getReason(){return mReason;}
    }
}
