package com.visni.corelibrary.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.visni.corelibrary.R;
import com.visni.corelibrary.util.VisniAlertDialog;

public class VisniCoreLibraryMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visni_core_library_main);
    }

    public void showVisniAlertDialog(String title, String msg, int icon, Boolean isCancelable){
        final VisniAlertDialog platFormAlert = new VisniAlertDialog(this);
        platFormAlert.setTitle(title);
        platFormAlert.setIcon(icon);
        platFormAlert.setMessage(msg);
        platFormAlert.setCancelable(isCancelable);
        platFormAlert.setPositveButton("Yes", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                platFormAlert.dismiss();
            }
        });

        platFormAlert.setNegativeButton("No", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        platFormAlert.show();
    }
}
