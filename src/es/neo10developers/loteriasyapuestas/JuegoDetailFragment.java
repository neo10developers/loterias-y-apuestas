package es.neo10developers.loteriasyapuestas;

import es.neo10developers.loteriasyapuestas.dummy.DummyContent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class JuegoDetailFragment extends Fragment {

    public static final String ARG_ITEM_ID = "item_id";

    DummyContent.DummyItem mItem;

    public JuegoDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments().containsKey(ARG_ITEM_ID)) {
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_juego_detail, container, false);
        if (mItem != null) {        	
        	((TextView) rootView.findViewById(R.id.juego_detail)).setText(mItem.content);
        	
        	Resultado res = new Resultado(getActivity());
        	
        	res.leerResultado(mItem.content);
        	
        	((TextView) rootView.findViewById(R.id.textView1)).setText(res.getFecha_sorteo());
        	
        	if(res.getJuego().equals("Lotería Nacional")){
        		
        		((TextView) rootView.findViewById(R.id.lbl1)).setText("Primer premio");
        		((TextView) rootView.findViewById(R.id.txt1)).setText(res.getPrimer_premio());
        		
        		((TextView) rootView.findViewById(R.id.lbl2)).setText("Fracción");
        		((TextView) rootView.findViewById(R.id.txt2)).setText(res.getFraccion());
        		
        		((TextView) rootView.findViewById(R.id.lbl3)).setText("Serie");
        		((TextView) rootView.findViewById(R.id.txt3)).setText(res.getSerie());
        		
        		((TextView) rootView.findViewById(R.id.lbl4)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt4)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt5)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt6)).setVisibility(View.GONE);
        	}
        	
        	if(res.getJuego().equals("La Primitiva") || res.getJuego().equals("BonoLoto")){
        		((TextView) rootView.findViewById(R.id.lbl1)).setText("Combinación ganadora");
        		((TextView) rootView.findViewById(R.id.txt1)).setText(res.getCombinacion_ordenada());
        		
        		((TextView) rootView.findViewById(R.id.lbl2)).setText("Complementario");
        		((TextView) rootView.findViewById(R.id.txt2)).setText(res.getComplementario());
        		
        		((TextView) rootView.findViewById(R.id.lbl3)).setText("Reintegro");
        		((TextView) rootView.findViewById(R.id.txt3)).setText(res.getReintegro());
        		
        		((TextView) rootView.findViewById(R.id.lbl4)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt4)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt5)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt6)).setVisibility(View.GONE);
        	}
        	
        	if(res.getJuego().equals("Euromillones")){
        		((TextView) rootView.findViewById(R.id.lbl1)).setText("Combinación ganadora");
        		((TextView) rootView.findViewById(R.id.txt1)).setText(res.getCombinacion_ordenada());
        		
        		((TextView) rootView.findViewById(R.id.lbl2)).setText("Estrellas");
        		((TextView) rootView.findViewById(R.id.txt2)).setText(res.getEstrellas());
        		
        		((TextView) rootView.findViewById(R.id.lbl3)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt3)).setVisibility(View.GONE);
        		
        		((TextView) rootView.findViewById(R.id.lbl4)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt4)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt5)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt6)).setVisibility(View.GONE);
        	}
        	
        	if(res.getJuego().equals("El Gordo")){
        		((TextView) rootView.findViewById(R.id.lbl1)).setText("Combinación ganadora");
        		((TextView) rootView.findViewById(R.id.txt1)).setText(res.getCombinacion_ordenada());
        		
        		((TextView) rootView.findViewById(R.id.lbl2)).setText("Reintegro");
        		((TextView) rootView.findViewById(R.id.txt2)).setText(res.getReintegro());
        		
        		((TextView) rootView.findViewById(R.id.lbl3)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt3)).setVisibility(View.GONE);
        		
        		((TextView) rootView.findViewById(R.id.lbl4)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt4)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt5)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt6)).setVisibility(View.GONE);
        	}
        	
        	if(res.getJuego().equals("Lototurf") || res.getJuego().equals("Quíntuple Plus")){
        		((TextView) rootView.findViewById(R.id.lbl1)).setText("Combinación ganadora");
        		((TextView) rootView.findViewById(R.id.txt1)).setText(res.getCombinacion_salida());
        		
        		((TextView) rootView.findViewById(R.id.lbl2)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt2)).setVisibility(View.GONE);
        		
        		((TextView) rootView.findViewById(R.id.lbl3)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt3)).setVisibility(View.GONE);
        		
        		((TextView) rootView.findViewById(R.id.lbl4)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt4)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt5)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt6)).setVisibility(View.GONE);
        	}
        	
        	if(res.getJuego().equals("La Quiniela")){
        		((TextView) rootView.findViewById(R.id.lbl1)).setText("Combinación ganadora");
        		((TextView) rootView.findViewById(R.id.txt1)).setText(res.getCombinacion_salida());
        		
        		((TextView) rootView.findViewById(R.id.lbl2)).setText("Pleno al 15");
        		((TextView) rootView.findViewById(R.id.txt2)).setText(res.getPleno15());
        		
        		((TextView) rootView.findViewById(R.id.lbl3)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt3)).setVisibility(View.GONE);
        		
        		((TextView) rootView.findViewById(R.id.lbl4)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt4)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt5)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt6)).setVisibility(View.GONE);
        	}
        	
        	if(res.getJuego().equals("El Quinigol")){
        		((TextView) rootView.findViewById(R.id.lbl1)).setText("Combinación ganadora");
        		((TextView) rootView.findViewById(R.id.txt1)).setText(res.getCombinacion_salida());
        		
        		((TextView) rootView.findViewById(R.id.lbl2)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt2)).setVisibility(View.GONE);
        		
        		((TextView) rootView.findViewById(R.id.lbl3)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt3)).setVisibility(View.GONE);
        		
        		((TextView) rootView.findViewById(R.id.lbl4)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt4)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt5)).setVisibility(View.GONE);
        		((TextView) rootView.findViewById(R.id.txt6)).setVisibility(View.GONE);
        	}
        	
        	
        }
        
        return rootView;
    }
}
