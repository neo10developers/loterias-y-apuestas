package es.neo10developers.loteriasyapuestas;

import java.util.List;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class Resultado {

	private Context ctx;
	
	private String juego;
	private String orden_sorteo;
	private String temporada_o_anyo;
	private String fecha_sorteo;
	private String nombre;
	private String lugar;
	private String dia_semana;
	private String hora;
	private String bote_promocional;
	private String combinacion_ordenada;
	private String combinacion_salida;
	private String reintegro;
	private String complementario;
	private String pleno15;
	private String estrellas;
	private String caballos;
	private String primer_premio;
	private String serie;
	private String fraccion;
	private String segundo_premio;
	private String bote_real;
	private String total_premios;
	private String recaudacion;
	private String apuestas;
	private String cat_1;
	private String acertantes_1;
	private String premio_1;
	private String cat_2;
	private String acertantes_2;
	private String premio_2;
	private String cat_3;
	private String acertantes_3;
	private String premio_3;
	private String cat_4;
	private String acertantes_4;
	private String premio_4;
	private String cat_5;
	private String acertantes_5;
	private String premio_5;
	private String cat_6;
	private String acertantes_6;
	private String premio_6;
	private String cat_7;
	private String acertantes_7;
	private String premio_7;
	private String cat_8;
	private String acertantes_8;
	private String premio_8;
	private String cat_9;
	private String acertantes_9;
	private String premio_9;
	private String cat_10;
	private String acertantes_10;
	private String premio_10;
	private String cat_11;
	private String acertantes_11;
	private String premio_11;
	private String cat_12;
	private String acertantes_12;
	private String premio_12;
	private String cat_13;
	private String acertantes_13;
	private String premio_13;
	
	public Resultado(Context ctx) {
		
		this.ctx = ctx;
		
		this.juego = "";
		this.orden_sorteo = "";
		this.temporada_o_anyo = "";
		this.fecha_sorteo = "";
		this.nombre = "";
		this.lugar = "";
		this.dia_semana = "";
		this.hora = "";
		this.bote_promocional = "";
		this.combinacion_ordenada = "";
		this.combinacion_salida = "";
		this.reintegro = "";
		this.complementario = "";
		this.pleno15 = "";
		this.estrellas = "";
		this.caballos = "";
		this.primer_premio = "";
		this.serie = "";
		this.fraccion = "";
		this.segundo_premio = "";
		this.bote_real = "";
		this.total_premios = "";
		this.recaudacion = "";
		this.apuestas = "";
		this.cat_1 = "";
		this.acertantes_1 = "";
		this.premio_1 = "";
		this.cat_2 = "";
		this.acertantes_2 = "";
		this.premio_2 = "";
		this.cat_3 = "";
		this.acertantes_3 = "";
		this.premio_3 = "";
		this.cat_4 = "";
		this.acertantes_4 = "";
		this.premio_4 = "";
		this.cat_5 = "";
		this.acertantes_5 = "";
		this.premio_5 = "";
		this.cat_6 = "";
		this.acertantes_6 = "";
		this.premio_6 = "";
		this.cat_7 = "";
		this.acertantes_7 = "";
		this.premio_7 = "";
		this.cat_8 = "";
		this.acertantes_8 = "";
		this.premio_8 = "";
		this.cat_9 = "";
		this.acertantes_9 = "";
		this.premio_9 = "";
		this.cat_10 = "";
		this.acertantes_10 = "";
		this.premio_10 = "";
		this.cat_11 = "";
		this.acertantes_11 = "";
		this.premio_11 = "";
		this.cat_12 = "";
		this.acertantes_12 = "";
		this.premio_12 = "";
		this.cat_13 = "";
		this.acertantes_13 = "";
		this.premio_13 = "";
	}

	public String getJuego() {
		return juego;
	}

	public void setJuego(String juego) {
		this.juego = juego;
	}

	public String getOrden_sorteo() {
		return orden_sorteo;
	}

	public void setOrden_sorteo(String orden_sorteo) {
		this.orden_sorteo = orden_sorteo;
	}

	public String getTemporada_o_anyo() {
		return temporada_o_anyo;
	}

	public void setTemporada_o_anyo(String temporada_o_anyo) {
		this.temporada_o_anyo = temporada_o_anyo;
	}

	public String getFecha_sorteo() {
		return fecha_sorteo;
	}

	public void setFecha_sorteo(String fecha_sorteo) {
		this.fecha_sorteo = fecha_sorteo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDia_semana() {
		return dia_semana;
	}

	public void setDia_semana(String dia_semana) {
		this.dia_semana = dia_semana;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getBote_promocional() {
		return bote_promocional;
	}

	public void setBote_promocional(String bote_promocional) {
		this.bote_promocional = bote_promocional;
	}

	public String getCombinacion_ordenada() {
		return combinacion_ordenada;
	}

	public void setCombinacion_ordenada(String combinacion_ordenada) {
		this.combinacion_ordenada = combinacion_ordenada;
	}

	public String getCombinacion_salida() {
		return combinacion_salida;
	}

	public void setCombinacion_salida(String combinacion_salida) {
		this.combinacion_salida = combinacion_salida;
	}

	public String getReintegro() {
		return reintegro;
	}

	public void setReintegro(String reintegro) {
		this.reintegro = reintegro;
	}

	public String getComplementario() {
		return complementario;
	}

	public void setComplementario(String complementario) {
		this.complementario = complementario;
	}

	public String getPleno15() {
		return pleno15;
	}

	public void setPleno15(String pleno15) {
		this.pleno15 = pleno15;
	}

	public String getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(String estrellas) {
		this.estrellas = estrellas;
	}

	public String getCaballos() {
		return caballos;
	}

	public void setCaballos(String caballos) {
		this.caballos = caballos;
	}

	public String getPrimer_premio() {
		return primer_premio;
	}

	public void setPrimer_premio(String primer_premio) {
		this.primer_premio = primer_premio;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getFraccion() {
		return fraccion;
	}

	public void setFraccion(String fraccion) {
		this.fraccion = fraccion;
	}

	public String getSegundo_premio() {
		return segundo_premio;
	}

	public void setSegundo_premio(String segundo_premio) {
		this.segundo_premio = segundo_premio;
	}

	public String getBote_real() {
		return bote_real;
	}

	public void setBote_real(String bote_real) {
		this.bote_real = bote_real;
	}

	public String getTotal_premios() {
		return total_premios;
	}

	public void setTotal_premios(String total_premios) {
		this.total_premios = total_premios;
	}

	public String getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(String recaudacion) {
		this.recaudacion = recaudacion;
	}

	public String getApuestas() {
		return apuestas;
	}

	public void setApuestas(String apuestas) {
		this.apuestas = apuestas;
	}

	public String getCat_1() {
		return cat_1;
	}

	public void setCat_1(String cat_1) {
		this.cat_1 = cat_1;
	}

	public String getAcertantes_1() {
		return acertantes_1;
	}

	public void setAcertantes_1(String acertantes_1) {
		this.acertantes_1 = acertantes_1;
	}

	public String getPremio_1() {
		return premio_1;
	}

	public void setPremio_1(String premio_1) {
		this.premio_1 = premio_1;
	}

	public String getCat_2() {
		return cat_2;
	}

	public void setCat_2(String cat_2) {
		this.cat_2 = cat_2;
	}

	public String getAcertantes_2() {
		return acertantes_2;
	}

	public void setAcertantes_2(String acertantes_2) {
		this.acertantes_2 = acertantes_2;
	}

	public String getPremio_2() {
		return premio_2;
	}

	public void setPremio_2(String premio_2) {
		this.premio_2 = premio_2;
	}

	public String getCat_3() {
		return cat_3;
	}

	public void setCat_3(String cat_3) {
		this.cat_3 = cat_3;
	}

	public String getAcertantes_3() {
		return acertantes_3;
	}

	public void setAcertantes_3(String acertantes_3) {
		this.acertantes_3 = acertantes_3;
	}

	public String getPremio_3() {
		return premio_3;
	}

	public void setPremio_3(String premio_3) {
		this.premio_3 = premio_3;
	}

	public String getCat_4() {
		return cat_4;
	}

	public void setCat_4(String cat_4) {
		this.cat_4 = cat_4;
	}

	public String getAcertantes_4() {
		return acertantes_4;
	}

	public void setAcertantes_4(String acertantes_4) {
		this.acertantes_4 = acertantes_4;
	}

	public String getPremio_4() {
		return premio_4;
	}

	public void setPremio_4(String premio_4) {
		this.premio_4 = premio_4;
	}

	public String getCat_5() {
		return cat_5;
	}

	public void setCat_5(String cat_5) {
		this.cat_5 = cat_5;
	}

	public String getAcertantes_5() {
		return acertantes_5;
	}

	public void setAcertantes_5(String acertantes_5) {
		this.acertantes_5 = acertantes_5;
	}

	public String getPremio_5() {
		return premio_5;
	}

	public void setPremio_5(String premio_5) {
		this.premio_5 = premio_5;
	}

	public String getCat_6() {
		return cat_6;
	}

	public void setCat_6(String cat_6) {
		this.cat_6 = cat_6;
	}

	public String getAcertantes_6() {
		return acertantes_6;
	}

	public void setAcertantes_6(String acertantes_6) {
		this.acertantes_6 = acertantes_6;
	}

	public String getPremio_6() {
		return premio_6;
	}

	public void setPremio_6(String premio_6) {
		this.premio_6 = premio_6;
	}

	public String getCat_7() {
		return cat_7;
	}

	public void setCat_7(String cat_7) {
		this.cat_7 = cat_7;
	}

	public String getAcertantes_7() {
		return acertantes_7;
	}

	public void setAcertantes_7(String acertantes_7) {
		this.acertantes_7 = acertantes_7;
	}

	public String getPremio_7() {
		return premio_7;
	}

	public void setPremio_7(String premio_7) {
		this.premio_7 = premio_7;
	}

	public String getCat_8() {
		return cat_8;
	}

	public void setCat_8(String cat_8) {
		this.cat_8 = cat_8;
	}

	public String getAcertantes_8() {
		return acertantes_8;
	}

	public void setAcertantes_8(String acertantes_8) {
		this.acertantes_8 = acertantes_8;
	}

	public String getPremio_8() {
		return premio_8;
	}

	public void setPremio_8(String premio_8) {
		this.premio_8 = premio_8;
	}

	public String getCat_9() {
		return cat_9;
	}

	public void setCat_9(String cat_9) {
		this.cat_9 = cat_9;
	}

	public String getAcertantes_9() {
		return acertantes_9;
	}

	public void setAcertantes_9(String acertantes_9) {
		this.acertantes_9 = acertantes_9;
	}

	public String getPremio_9() {
		return premio_9;
	}

	public void setPremio_9(String premio_9) {
		this.premio_9 = premio_9;
	}

	public String getCat_10() {
		return cat_10;
	}

	public void setCat_10(String cat_10) {
		this.cat_10 = cat_10;
	}

	public String getAcertantes_10() {
		return acertantes_10;
	}

	public void setAcertantes_10(String acertantes_10) {
		this.acertantes_10 = acertantes_10;
	}

	public String getPremio_10() {
		return premio_10;
	}

	public void setPremio_10(String premio_10) {
		this.premio_10 = premio_10;
	}

	public String getCat_11() {
		return cat_11;
	}

	public void setCat_11(String cat_11) {
		this.cat_11 = cat_11;
	}

	public String getAcertantes_11() {
		return acertantes_11;
	}

	public void setAcertantes_11(String acertantes_11) {
		this.acertantes_11 = acertantes_11;
	}

	public String getPremio_11() {
		return premio_11;
	}

	public void setPremio_11(String premio_11) {
		this.premio_11 = premio_11;
	}

	public String getCat_12() {
		return cat_12;
	}

	public void setCat_12(String cat_12) {
		this.cat_12 = cat_12;
	}

	public String getAcertantes_12() {
		return acertantes_12;
	}

	public void setAcertantes_12(String acertantes_12) {
		this.acertantes_12 = acertantes_12;
	}

	public String getPremio_12() {
		return premio_12;
	}

	public void setPremio_12(String premio_12) {
		this.premio_12 = premio_12;
	}

	public String getCat_13() {
		return cat_13;
	}

	public void setCat_13(String cat_13) {
		this.cat_13 = cat_13;
	}

	public String getAcertantes_13() {
		return acertantes_13;
	}

	public void setAcertantes_13(String acertantes_13) {
		this.acertantes_13 = acertantes_13;
	}

	public String getPremio_13() {
		return premio_13;
	}

	public void setPremio_13(String premio_13) {
		this.premio_13 = premio_13;
	}

	public void insertarResultados(List<Resultado> resultados) {
		//Abrimos la base de datos 'ineed.db' en modo escritura
		SQLiteLoteriasHelper lh = new SQLiteLoteriasHelper(ctx);
        SQLiteDatabase db = lh.getWritableDatabase();
        
        if(resultados.size() > 0){
        	db.execSQL(lh.sqlEliminaResultados);
        	db.execSQL(lh.sqlCreaResultados);
        }
        
        db.execSQL("BEGIN");
    	for(Resultado res:resultados){
    		try {
    			
    			ContentValues values = new ContentValues();
    			
    			values.put("Juego", res.getJuego());
    			values.put("Orden_sorteo", res.getOrden_sorteo());
    			values.put("Temporada_o_anyo", res.getTemporada_o_anyo());
    			values.put("Fecha_sorteo", res.getFecha_sorteo());
    			values.put("Nombre", res.getNombre());
    			values.put("Lugar", res.getLugar());
    			values.put("Dia_semana", res.getDia_semana());
    			values.put("Hora", res.getHora());
    			values.put("Bote_promocional", res.getBote_promocional());
    			values.put("Combinacion_ordenada", res.getCombinacion_ordenada());
    			values.put("Combinacion_salida", res.getCombinacion_salida());
    			values.put("Reintegro", res.getReintegro());
    			values.put("Complementario", res.getComplementario());
    			values.put("Pleno15", res.getPleno15());
    			values.put("Estrellas", res.getEstrellas());
    			values.put("Caballos", res.getCaballos());
    			values.put("Primer_premio", res.getPrimer_premio());
    			values.put("Serie", res.getSerie());
    			values.put("Fraccion", res.getFraccion());
    			values.put("Segundo_premio", res.getSegundo_premio());
    			values.put("Bote_real", res.getBote_real());
    			values.put("Total_premios", res.getTotal_premios());
    			values.put("Recaudacion", res.getRecaudacion());
    			values.put("Apuestas", res.getApuestas());
    			values.put("Cat_1", res.getCat_1());
    			values.put("Acertantes_1", res.getAcertantes_1());
    			values.put("Premio_1", res.getPremio_1());
    			values.put("Cat_2", res.getCat_2());
    			values.put("Acertantes_2", res.getAcertantes_2());
    			values.put("Premio_2", res.getPremio_2());
    			values.put("Cat_3", res.getCat_3());
    			values.put("Acertantes_3", res.getAcertantes_3());
    			values.put("Premio_3", res.getPremio_3());
    			values.put("Cat_4", res.getCat_4());
    			values.put("Acertantes_4", res.getAcertantes_4());
    			values.put("Premio_4", res.getPremio_4());
    			values.put("Cat_5", res.getCat_5());
    			values.put("Acertantes_5", res.getAcertantes_5());
    			values.put("Premio_5", res.getPremio_5());
    			values.put("Cat_6", res.getCat_6());
    			values.put("Acertantes_6", res.getAcertantes_6());
    			values.put("Premio_6", res.getPremio_6());
    			values.put("Cat_7", res.getCat_7());
    			values.put("Acertantes_7", res.getAcertantes_7());
    			values.put("Premio_7", res.getPremio_7());
    			values.put("Cat_8", res.getCat_8());
    			values.put("Acertantes_8", res.getAcertantes_8());
    			values.put("Premio_8", res.getPremio_8());
    			values.put("Cat_9", res.getCat_9());
    			values.put("Acertantes_9", res.getAcertantes_9());
    			values.put("Premio_9", res.getPremio_9());
    			values.put("Cat_10", res.getCat_10());
    			values.put("Acertantes_10", res.getAcertantes_10());
    			values.put("Premio_10", res.getPremio_10());
    			values.put("Cat_11", res.getCat_11());
    			values.put("Acertantes_11", res.getAcertantes_11());
    			values.put("Premio_11", res.getPremio_11());
    			values.put("Cat_12", res.getCat_12());
    			values.put("Acertantes_12", res.getAcertantes_12());
    			values.put("Premio_12", res.getPremio_12());
    			values.put("Cat_13", res.getCat_13());
    			values.put("Acertantes_13", res.getAcertantes_13());
    			values.put("Premio_13", res.getPremio_13());
    			
    			db.insert("Resultados", null, values);
	        } catch (SQLException e) {
	        	e.printStackTrace();
	        }
        }        
    	db.execSQL("COMMIT");
    	
    	db.close();
        lh.close();
	}
	
	public String leerJuegoPorPosicion(int pos){
		String juego = "";
		
		switch(pos){
			case 1:
				juego = "La Quiniela";
				break;
			case 2:
				juego = "Lotería Nacional";
				break;
			case 3:
				juego = "La Primitiva";
				break;
			case 4:
				juego = "Euromillones";
				break;
			case 5:
				juego = "BonoLoto";
				break;
			case 6:
				juego = "El Gordo";
				break;
			case 7:
				juego = "El Quinigol";
				break;
			case 8:
				juego = "Lototurf";
				break;
			case 9:
				juego = "Quíntuple Plus";
				break;
		}		
		
		return juego;
	}
	
	public void leerResultado(String juego){
	    
		//Abrimos la base de datos 'ineed.db' en modo escritura
		SQLiteLoteriasHelper lh = new SQLiteLoteriasHelper(ctx);
		SQLiteDatabase db = lh.getReadableDatabase();
		
		Cursor c = db.query("Resultados", new String[] { "*" }, "Juego = ?", new String[] { juego }, null, null, "fecha_sorteo DESC LIMIT 1");

	    c.moveToFirst();
	    while (!c.isAfterLast()) {
	    	
	    	setJuego(c.getString(0));
	    	setOrden_sorteo(c.getString(1));
	    	setTemporada_o_anyo(c.getString(2));
	    	setFecha_sorteo(Utilidades.sqlite2fecha(c.getString(3)));
	    	setNombre(c.getString(4));
	    	setLugar(c.getString(5));
	    	setDia_semana(c.getString(6));
	    	setHora(c.getString(7));
	    	setBote_promocional(c.getString(8));
	    	setCombinacion_ordenada(c.getString(9));
	    	setCombinacion_salida(c.getString(10));
	    	setReintegro(c.getString(11));
	    	setComplementario(c.getString(12));
	    	setPleno15(c.getString(13));
	    	setEstrellas(c.getString(14));
	    	setCaballos(c.getString(15));
	    	setPrimer_premio(c.getString(16));
	    	setSerie(c.getString(17));
	    	setFraccion(c.getString(18));
	    	setSegundo_premio(c.getString(19));
	    	setBote_real(c.getString(20));
	    	setTotal_premios(c.getString(21));
	    	setRecaudacion(c.getString(22));
	    	setApuestas(c.getString(23));
	    	setCat_1(c.getString(24));
	    	setAcertantes_1(c.getString(25));
	    	setPremio_1(c.getString(26));
	    	setCat_2(c.getString(27));
	    	setAcertantes_2(c.getString(28));
	    	setPremio_2(c.getString(29));
	    	setCat_3(c.getString(30));
	    	setAcertantes_3(c.getString(31));
	    	setPremio_3(c.getString(32));
	    	setCat_4(c.getString(33));
	    	setAcertantes_4(c.getString(34));
	    	setPremio_4(c.getString(35));
	    	setCat_5(c.getString(36));
	    	setAcertantes_5(c.getString(37));
	    	setPremio_5(c.getString(38));
	    	setCat_6(c.getString(39));
	    	setAcertantes_6(c.getString(40));
	    	setPremio_6(c.getString(41));
	    	setCat_7(c.getString(42));
	    	setAcertantes_7(c.getString(43));
	    	setPremio_7(c.getString(44));
	    	setCat_8(c.getString(45));
	    	setAcertantes_8(c.getString(46));
	    	setPremio_8(c.getString(47));
	    	setCat_9(c.getString(48));
	    	setAcertantes_9(c.getString(49));
	    	setPremio_9(c.getString(50));
	    	setCat_10(c.getString(51));
	    	setAcertantes_10(c.getString(52));
	    	setPremio_10(c.getString(53));
	    	setCat_11(c.getString(54));
	    	setAcertantes_11(c.getString(55));
	    	setPremio_11(c.getString(56));
	    	setCat_12(c.getString(57));
	    	setAcertantes_12(c.getString(58));
	    	setPremio_12(c.getString(59));
	    	setCat_13(c.getString(60));
	    	setAcertantes_13(c.getString(61));
	    	setPremio_13(c.getString(62));	    	
	    	
	      c.moveToNext();
	    }
	    // Make sure to close the cursor
	    c.close();
	    db.close();
        lh.close();
	}
}