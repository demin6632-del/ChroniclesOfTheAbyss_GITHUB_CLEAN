package com.chronicles.abyss;
import android.app.*; import android.os.*; import android.webkit.*;
public class MainActivity extends Activity { public void onCreate(Bundle b){super.onCreate(b); WebView w=new WebView(this); w.getSettings().setJavaScriptEnabled(true); w.loadUrl("file:///android_asset/game.html"); setContentView(w);}}