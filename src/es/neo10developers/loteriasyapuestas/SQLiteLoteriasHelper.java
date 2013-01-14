package es.neo10developers.loteriasyapuestas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteLoteriasHelper extends SQLiteOpenHelper{

	//Versión de la Base de datos
    static int versionBBDD = 1;
	
	public SQLiteLoteriasHelper(Context ctx) {
		super(ctx, "loterias.db", null, versionBBDD);
	}
	
	String sqlCreaResultados = "CREATE TABLE IF NOT EXISTS [Resultados] ([Juego] NVARCHAR(100)  NULL,[Orden_sorteo] NVARCHAR(100)  NULL,[Temporada_o_anyo] NVARCHAR(100)  NULL,[Fecha_sorteo] NVARCHAR(100)  NULL,[Nombre] NVARCHAR(100)  NULL,[Lugar] NVARCHAR(100)  NULL,[Dia_semana] NVARCHAR(100)  NULL,[Hora] NVARCHAR(100)  NULL,[Bote_promocional] NVARCHAR(100)  NULL,[Combinacion_ordenada] NVARCHAR(100)  NULL,[Combinacion_salida] NVARCHAR(100)  NULL,[Reintegro] NVARCHAR(100)  NULL,[Complementario] NVARCHAR(100)  NULL,[Pleno15] NVARCHAR(100)  NULL,[Estrellas] NVARCHAR(100)  NULL,[Caballos] NVARCHAR(100)  NULL,[Primer_premio] NVARCHAR(100)  NULL,[Serie] NVARCHAR(100)  NULL,[Fraccion] NVARCHAR(100)  NULL,[Segundo_premio] NVARCHAR(100)  NULL,[Bote_real] NVARCHAR(100)  NULL,[Total_premios] NVARCHAR(100)  NULL,[Recaudacion] NVARCHAR(100)  NULL,[Apuestas] NVARCHAR(100)  NULL,[Cat_1] NVARCHAR(100)  NULL,[Acertantes_1] NVARCHAR(100)  NULL,[Premio_1] NVARCHAR(100)  NULL,[Cat_2] NVARCHAR(100)  NULL,[Acertantes_2] NVARCHAR(100)  NULL,[Premio_2] NVARCHAR(100)  NULL,[Cat_3] NVARCHAR(100)  NULL,[Acertantes_3] NVARCHAR(100)  NULL,[Premio_3] NVARCHAR(100)  NULL,[Cat_4] NVARCHAR(100)  NULL,[Acertantes_4] NVARCHAR(100)  NULL,[Premio_4] NVARCHAR(100)  NULL,[Cat_5] NVARCHAR(100)  NULL,[Acertantes_5] NVARCHAR(100)  NULL,[Premio_5] NVARCHAR(100)  NULL,[Cat_6] NVARCHAR(100)  NULL,[Acertantes_6] NVARCHAR(100)  NULL,[Premio_6] NVARCHAR(100)  NULL,[Cat_7] NVARCHAR(100)  NULL,[Acertantes_7] NVARCHAR(100)  NULL,[Premio_7] NVARCHAR(100)  NULL,[Cat_8] NVARCHAR(100)  NULL,[Acertantes_8] NVARCHAR(100)  NULL,[Premio_8] NVARCHAR(100)  NULL,[Cat_9] NVARCHAR(100)  NULL,[Acertantes_9] NVARCHAR(100)  NULL,[Premio_9] NVARCHAR(100)  NULL,[Cat_10] NVARCHAR(100)  NULL,[Acertantes_10] NVARCHAR(100)  NULL,[Premio_10] NVARCHAR(100)  NULL,[Cat_11] NVARCHAR(100)  NULL,[Acertantes_11] NVARCHAR(100)  NULL,[Premio_11] NVARCHAR(100)  NULL,[Cat_12] NVARCHAR(100)  NULL,[Acertantes_12] NVARCHAR(100)  NULL,[Premio_12] NVARCHAR(100)  NULL,[Cat_13] NVARCHAR(100)  NULL,[Acertantes_13] NVARCHAR(100)  NULL,[Premio_13] NVARCHAR(100)  NULL)";
	
	String sqlEliminaResultados = "DROP TABLE IF EXISTS Resultados";

	@Override
	public void onCreate(SQLiteDatabase db) {
		//Se ejecuta la sentencia SQL de creación de la tabla
    	db.execSQL(sqlCreaResultados);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL(sqlEliminaResultados);
		db.execSQL(sqlCreaResultados);
	}
}