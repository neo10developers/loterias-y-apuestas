package es.neo10developers.loteriasyapuestas;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class JuegoListActivity extends FragmentActivity implements JuegoListFragment.Callbacks {

    private boolean mTwoPane;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_list);

        if (findViewById(R.id.juego_detail_container) != null) {
            mTwoPane = true;
            ((JuegoListFragment) getSupportFragmentManager().findFragmentById(R.id.juego_list)).setActivateOnItemClick(true);
        }
        
        //Si hay conexión
        if(Utilidades.laRedEstaDisponible(getApplicationContext())){
	        ObtenerResultados.descargarResultados(getApplicationContext());
	        ObtenerResultados.procesarResultados(getApplicationContext());
        }else{
        	//Sino, avisar al usuario
        	Toast.makeText(getApplicationContext(), "Para obtener los últimos resultados por favor conecte una red de datos y vuelva a intentarlo.", Toast.LENGTH_LONG).show();
        }
        
    }

    @Override
    public void onItemSelected(String id) {
        if (mTwoPane) {
            Bundle arguments = new Bundle();
            arguments.putString(JuegoDetailFragment.ARG_ITEM_ID, id);
            JuegoDetailFragment fragment = new JuegoDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction().replace(R.id.juego_detail_container, fragment).commit();

        } else {
            Intent detailIntent = new Intent(this, JuegoDetailActivity.class);
            detailIntent.putExtra(JuegoDetailFragment.ARG_ITEM_ID, id);
            startActivity(detailIntent);
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_loterias, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {    	
    	
    	switch (item.getItemId()) {
        	case android.R.id.home:
        		//Mostrar acerca de
        		 lanzaAcercaDe();
        		return true;        	
        
        	case R.id.menu_salir:
        		//Mostramos el diálogo de confirmación
            	AlertDialog.Builder builder = new AlertDialog.Builder(this);
            	builder.setMessage("¿Seguro que quiere salir?")
            	       .setCancelable(false)
            	       .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
            	           public void onClick(DialogInterface dialog, int id) {
            	        	   finish();
            	           }
            	       })
            	       .setNegativeButton("No", new DialogInterface.OnClickListener() {
            	           public void onClick(DialogInterface dialog, int id) {
            	                dialog.cancel();
            	           }
            	       });
            	AlertDialog alert = builder.create();
            	alert.show();
                return true;
                
        	case R.id.menu_compartir:
        		compartirResultado();
        		
        		return true; 
        		
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    
    private void compartirResultado(){
    	Resultado res = new Resultado(this);
    	
    	res.leerResultado(res.leerJuegoPorPosicion(JuegoListFragment.posicion));
    	
    	String titulo = "Resultado de " + res.getJuego();
    	
    	String texto = titulo + " \n\n" + "Fecha del sorteo: " + res.getFecha_sorteo() + "\n\n";
		
		if(res.getJuego().equals("Lotería Nacional")){
    		
    		texto += "Primer premio: " + res.getPrimer_premio() + "\n";
    		texto += "Fracción: " + res.getFraccion() + "\n";
    		texto += "Serie: " + res.getSerie() + "\n";
    	}
    	
    	if(res.getJuego().equals("La Primitiva") || res.getJuego().equals("BonoLoto")){
    		
    		texto += "Combinación ganadora: " + res.getCombinacion_ordenada() + "\n";
    		texto += "Complementario: " + res.getComplementario() + "\n";
    		texto += "Reintegro: " + res.getReintegro() + "\n";
    	}
    	
    	if(res.getJuego().equals("Euromillones")){
    		
    		texto += "Combinación ganadora: " + res.getCombinacion_ordenada() + "\n";
    		texto += "Estrellas: " + res.getEstrellas() + "\n";
    	}
    	
    	if(res.getJuego().equals("El Gordo")){
    		
    		texto += "Combinación ganadora: " + res.getCombinacion_ordenada() + "\n";
    		texto += "Reintegro: " + res.getReintegro() + "\n";
    	}
    	
    	if(res.getJuego().equals("Lototurf") || res.getJuego().equals("Quíntuple Plus")){
    		
    		texto += "Combinación ganadora: " + res.getCombinacion_salida() + "\n";
    	}
    	
    	if(res.getJuego().equals("La Quiniela")){
    		
    		texto += "Combinación ganadora: " + res.getCombinacion_salida() + "\n";
    		texto += "Pleno al 15: " + res.getPleno15() + "\n";	        	
    	}
    	
    	if(res.getJuego().equals("El Quinigol")){
    		texto += "Combinación ganadora: " + res.getCombinacion_salida() + "\n";
    	}	        
		
		Intent intent = new Intent(Intent.ACTION_SEND);

		intent.setType("text/plain");
		intent.putExtra(Intent.EXTRA_SUBJECT, titulo);
		intent.putExtra(Intent.EXTRA_TEXT, texto);

		startActivity(Intent.createChooser(intent, "Compartir"));
    }
    
    private void lanzaAcercaDe(){
    	Intent i = new Intent(this, Acerca_de.class);
    	startActivity(i);
    }
}
