package sio2.ppe.mission6.recupmater4android;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

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
    
    	TextView response;
    	String uri="";
        HttpGet get = new HttpGet();
        get.setURI(uri);
        DefaultHttpClient httpClient =   new DefaultHttpClient();
        HttpResponse httpResponse = httpClient.execute(get);
        if (httpResponse.getStatusLine().getStatusCode() == 200) {
            Log.d("[GET REQUEST]", "HTTP Get succeeded");

            HttpEntity messageEntity = httpResponse.getEntity();
            InputStream is = messageEntity.getContent();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = br.readLine()) != null) {
               	response.append(line);
            }
    
    
}
