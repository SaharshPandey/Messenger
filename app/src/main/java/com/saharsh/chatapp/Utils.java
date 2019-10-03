package com.saharsh.chatapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class Utils {

    public static ProgressDialog showLoader(Context context){
            ProgressDialog dialog = new ProgressDialog(context);
            try {
                dialog.show();
            } catch (WindowManager.BadTokenException e) {

            }
            dialog.setCancelable(false);
            dialog.getWindow()
                    .setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
            dialog.setContentView(R.layout.progressdialog);
            return dialog;
            // dialog.setMessage(Message);

    }
    public static void hideLoader(ProgressDialog dialog){
        // To dismiss the dialog
        if(dialog!=null){
        dialog.dismiss();
        }
    }
}
