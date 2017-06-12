package edu.cecyt9.ipn.practica5_intenciones;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {


   public void abrirPaginaWeb(View paginaWeb)
   {
       Intent intent = new Intent(Intent.ACTION_VIEW,
                                  Uri.parse("https://www.lacasadetono.com.mx/"));
       startActivity(intent);
   }

    public void llamadaTelefono(View llamada)
    {
        Intent intent = new Intent(Intent.ACTION_CALL,
                Uri.parse("tel:5531126232"));
        startActivity(intent);
    }

    public void googleMaps(View maps)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                //Uri.parse("geo:19.4833442, -99.08781120000003"));
                Uri.parse("geo:19.465292,-99.1878054"));
        startActivity(intent);
    }

    public void tomarFoto(View maps)
    {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }

    public void mandarCorreo(View correo)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Nuevo pedido");
        intent.putExtra(Intent.EXTRA_TEXT, "Contenido del correo: Pozole, tacos y más");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "carol.zapata@outlook.es"} );
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
