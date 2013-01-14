package es.neo10developers.loteriasyapuestas;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Utilidades {
	//Comprobamos si hay una conexión disponible
	public static boolean laRedEstaDisponible(Context context) {
		boolean value = false;
		
		ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo info = manager.getActiveNetworkInfo();
		
		if (info != null && info.isAvailable()) {
			value = true;
		}
		
		return value;
	}
	
	public static String fechaActual2Sqlite() {
		// Devuelve la fecha actual formateada para el sqlite
		long msTime = System.currentTimeMillis();
		Date anotherCurDate = new Date(msTime);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String formattedDateString = formatter.format(anotherCurDate);

		return formattedDateString;
	}
	
	public static String fechaActualMenosXdias2Sqlite(int dias) {
		Calendar calendar = Calendar.getInstance(); // obtiene la fecha de hoy
		calendar.add(Calendar.DATE, -dias); // le restamos los dias que queremos

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String formattedDateString = formatter.format(calendar.getTime());

		return formattedDateString;
	}
	
	public static String sqlite2fecha(String fecha) {
		String fechaConvertida = "";

		try {
			String[] wordArray = fecha.split("-");
			fechaConvertida = wordArray[2] + "/" + wordArray[1] + "/" + wordArray[0];
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fechaConvertida;
	}

	public static String fecha2Sqlite(String fecha) {
		String[] wordArray = fecha.split("/");
		String fechaConvertida = wordArray[2] + "-" + wordArray[1] + "-" + wordArray[0];

		return fechaConvertida;
	}
}
