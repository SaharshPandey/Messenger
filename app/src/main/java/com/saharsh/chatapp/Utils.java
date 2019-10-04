package com.saharsh.chatapp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
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

    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void hideLoader(ProgressDialog dialog){
        // To dismiss the dialog
        if(dialog!=null){
        dialog.dismiss();
        }
    }
}
