package com.free.videochatwithgirls.toasterexample;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void ShowMessage(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
