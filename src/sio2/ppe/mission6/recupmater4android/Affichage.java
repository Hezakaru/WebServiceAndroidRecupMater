package sio2.ppe.mission6.recupmater4android;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;

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

    
        StringBuffer leBuffer = new StringBuffer("");
    	BufferedReader leLecteur = null;
    	try
    	{
    		DefaultHttpClient httpClient =   new DefaultHttpClient();
    		HttpGet adrGet = new HttpGet();
    		URI luri= new URI("URL DU WEB SERVICE");
    		adrGet.setURI(luri);
    		HttpResponse laReponse = httpClient.execute(adrGet);
    		InputStream leFluxEntree = laReponse.getEntity().getContent();
    		leLecteur = new BufferedReader(new InputStreamReader(leFluxEntree));
    		HttpEntity messageEntity = laReponse.getEntity();
    		String laLigne = leLecteur.readLine();
        
    		while (laLigne!=null) 
    		{
    			leBuffer.append(laLigne);
    			leBuffer.append("\n");
    			laLigne = leLecteur.readLine();
    		}
//    		TextView affich= (TextView)findViewById(R.id.contenu);
//    		affich.setText(leBuffer.toString());
    	}
    	catch (Exception e) 
    		{
    		// TODO: handle exception
    		}
    	
    	finally
    	{
    		if (leLecteur!=null)
    		try 
    		{
    			leLecteur.close();
    		}
    		
    		catch (IOException e) 
    		{
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	}
    }
}
