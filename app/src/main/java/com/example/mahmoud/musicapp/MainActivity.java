package com.example.mahmoud.musicapp;

import android.app.Application;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    final private int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    final private float LEFT_VOLUM = 1.0f;
    final private float RIGHT_VOLUM = 1.0f;
    final private int LOOP = 0;
    final private int PRIORITY = 0;
    final private float RATE = 1.0f;
    private SoundPool msoundpool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msoundpool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC,0);
        mCSoundId = msoundpool.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId = msoundpool.load(getApplicationContext(),R.raw.note2_d,1);
        mESoundId = msoundpool.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundId = msoundpool.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundId = msoundpool.load(getApplicationContext(),R.raw.note5_g,1);
        mASoundId = msoundpool.load(getApplicationContext(),R.raw.note7_b,1);
        mBSoundId = msoundpool.load(getApplicationContext(),R.raw.note7_b,1);

    }
    public void playC(View v)
    {
        msoundpool.play(mCSoundId,LEFT_VOLUM,RIGHT_VOLUM,PRIORITY,LOOP,RATE);
    }
    public void playD(View v)
    {
        msoundpool.play(mDSoundId,LEFT_VOLUM,RIGHT_VOLUM,PRIORITY,LOOP,RATE);
    }
    public void playE(View v)
    {
        msoundpool.play(mESoundId,LEFT_VOLUM,RIGHT_VOLUM,PRIORITY,LOOP,RATE);
    }
    public void playF(View v)
    {
        msoundpool.play(mFSoundId,LEFT_VOLUM,RIGHT_VOLUM,PRIORITY,LOOP,RATE);
    }
    public void playG(View v)
    {
        msoundpool.play(mGSoundId,LEFT_VOLUM,RIGHT_VOLUM,PRIORITY,LOOP,RATE);
    }
    public void playA(View v)
    {
        msoundpool.play(mASoundId,LEFT_VOLUM,RIGHT_VOLUM,PRIORITY,LOOP,RATE);
    }
    public void playB(View v)
    {
        msoundpool.play(mBSoundId,LEFT_VOLUM,RIGHT_VOLUM,PRIORITY,LOOP,RATE);
    }
}
