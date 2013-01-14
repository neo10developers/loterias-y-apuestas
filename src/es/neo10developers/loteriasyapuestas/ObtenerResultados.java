package es.neo10developers.loteriasyapuestas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import android.content.Context;
import android.os.StrictMode;
import android.util.Log;

public class ObtenerResultados {
	
	private static String URL = "http://www.loteriasyapuestas.es/index.php/mod.sorteos/mem.exportarSorteos/filtro_cf.celebrado/juego.LNAC-LAPR-EMIL-BONO-ELGR-LAQU-QGOL-LOTU-QUPL/"; //fecha_ini.2012-09-01/fecha_fin.2012-09-09";
	private static String NOMBRE_FICHERO = "resultadosSorteos.txt";
	private static String NOMBRE_FICHERO_UTF8 = "resultadosSorteosUTF8.txt";

	//Descargar el fichero e resultados
	public static boolean descargarResultados(Context ctx) {
    	boolean descargado = false;
    	
    	String fechaI = Utilidades.fechaActualMenosXdias2Sqlite(30);
    	String fechaF = Utilidades.fechaActual2Sqlite();    	
		
		ctx.deleteFile(NOMBRE_FICHERO);
		
		//NOTA: Las fechas tienen que estar en formato AAAA-MM-DD
		
		URL += "fecha_ini." + fechaI + "/fecha_fin." + fechaF;
    			
		//Habría que poner una especie de timeout máximo para que no se quede bloqueado
    	try {
    		
    		//Esto es mejorable
    		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
    		StrictMode.setThreadPolicy(policy);
    		
    		//Sencillo método de descarga de un fichero desde Internet. Una línea
    		new DefaultHttpClient().execute(new HttpGet(URL)).getEntity().writeTo(new FileOutputStream(new File(ctx.getFilesDir() + "/", NOMBRE_FICHERO)));
    		
			convierteAutf8(ctx);
			
			descargado = true;
    	  } catch(FileNotFoundException e) {
    	      return false; // swallow a 404
    	  } catch (IOException e) {
    	      return false; // swallow a 404
    	  }
    	
    	return descargado;
    }
	
	public static void convierteAutf8(Context ctx) {

		try {
			FileInputStream fis = ctx.openFileInput(NOMBRE_FICHERO);
			FileOutputStream fos = ctx.openFileOutput(NOMBRE_FICHERO_UTF8, Context.MODE_PRIVATE);

			// Entrada
			BufferedReader in = new BufferedReader(new InputStreamReader(fis, "8859_1"));

			// Salida
			Writer out = new BufferedWriter(new OutputStreamWriter(fos, "utf-8"));

			String sCadena;
			while ((sCadena = in.readLine()) != null) {
				out.write(sCadena + "\n");
			}

			in.close();
			out.close();
		} catch (Exception e) {
			Log.e("Caracteres", e.getMessage(), e);
		}
	}
	
	public static void procesarResultados(Context ctx){
		FileInputStream file = null;
		try {
			file = ctx.openFileInput(NOMBRE_FICHERO_UTF8);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			return;
		}

		Resultado res = new Resultado(ctx);
		List<Resultado> resultados = new ArrayList<Resultado>();
		
		try {
			// Importante para los acentos
			String UTF8 = "utf8";
			int BUFFER_SIZE = 8192;

			BufferedReader br = new BufferedReader(new InputStreamReader(file, UTF8), BUFFER_SIZE);

			String line;

			while ((line = br.readLine()) != null) {
				res = new Resultado(ctx);

				// Partimos por puntos y coma. Para tener en cuenta los blancos, utilizar el parámetro -1
				String[] campos = line.split(";", -1);

				try {
					res.setJuego(campos[0]);
					res.setOrden_sorteo(campos[1]);
					res.setTemporada_o_anyo(campos[2]);
					res.setFecha_sorteo(Utilidades.fecha2Sqlite(campos[3]));
					res.setNombre(campos[4]);
					res.setLugar(campos[5]);
					res.setDia_semana(campos[6]);
					res.setHora(campos[7]);
					res.setBote_promocional(campos[8]);
					res.setCombinacion_ordenada(campos[9]);
					res.setCombinacion_salida(campos[10]);
					res.setReintegro(campos[11]);
					res.setComplementario(campos[12]);
					res.setPleno15(campos[13]);
					res.setEstrellas(campos[14]);
					res.setCaballos(campos[15]);
					res.setPrimer_premio(campos[16]);
					res.setSerie(campos[17]);
					res.setFraccion(campos[18]);
					res.setSegundo_premio(campos[19]);
					res.setBote_real(campos[20]);
					res.setTotal_premios(campos[21]);
					res.setRecaudacion(campos[22]);
					res.setApuestas(campos[23]);
					res.setCat_1(campos[24]);
					res.setAcertantes_1(campos[25]);
					res.setPremio_1(campos[26]);
					res.setCat_2(campos[27]);
					res.setAcertantes_2(campos[28]);
					res.setPremio_2(campos[29]);
					res.setCat_3(campos[30]);
					res.setAcertantes_3(campos[31]);
					res.setPremio_3(campos[32]);
					res.setCat_4(campos[33]);
					res.setAcertantes_4(campos[34]);
					res.setPremio_4(campos[35]);
					res.setCat_5(campos[36]);
					res.setAcertantes_5(campos[37]);
					res.setPremio_5(campos[38]);
					res.setCat_6(campos[39]);
					res.setAcertantes_6(campos[40]);
					res.setPremio_6(campos[41]);
					res.setCat_7(campos[42]);
					res.setAcertantes_7(campos[43]);
					res.setPremio_7(campos[44]);
					res.setCat_8(campos[45]);
					res.setAcertantes_8(campos[46]);
					res.setPremio_8(campos[47]);
					res.setCat_9(campos[48]);
					res.setAcertantes_9(campos[49]);
					res.setPremio_9(campos[50]);
					res.setCat_10(campos[51]);
					res.setAcertantes_10(campos[52]);
					res.setPremio_10(campos[53]);
					res.setCat_11(campos[54]);
					res.setAcertantes_11(campos[55]);
					res.setPremio_11(campos[56]);
					res.setCat_12(campos[57]);
					res.setAcertantes_12(campos[58]);
					res.setPremio_12(campos[59]);
					res.setCat_13(campos[60]);
					res.setAcertantes_13(campos[61]);
					res.setPremio_13(campos[62]);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				resultados.add(res);
			}
								
			res.insertarResultados(resultados);
			
			ctx.deleteFile(NOMBRE_FICHERO);
			ctx.deleteFile(NOMBRE_FICHERO_UTF8);
		} catch (IOException e) {
			Log.e("error", e.toString());
		}
	}
	
	
}