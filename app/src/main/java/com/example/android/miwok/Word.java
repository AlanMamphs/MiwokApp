package com.example.android.miwok;

import android.graphics.Color;

/**
 * Created by alisher on 7/7/16.
 */
public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranlation;
    private int mImageResourceId = NO_IMG_PROVIDED;
    private int mSoundResourceId;

    public static final int NO_IMG_PROVIDED = -1;


    public Word(String miwokTranslation, String defaultTranslation, int SoundResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranlation = defaultTranslation;
        mSoundResourceId = SoundResourceId;
    }

    public Word(String miwokTranslation, String defaultTranslation, int ImageResourceId, int SoundResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranlation = defaultTranslation;
        mImageResourceId = ImageResourceId;
        mSoundResourceId = SoundResourceId;
    }



    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }
    public String getmDefaultTranlation(){
        return mDefaultTranlation;
    }

    public int getmImageResourceId(){
        return mImageResourceId;
    }
    public int getmSoundResourceId(){
        return mSoundResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId!=-1;
    }

}
