package sio2.ppe.mission6.recupmater4android;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Affichage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.affichage, menu);
        return true;
    }
    
}
