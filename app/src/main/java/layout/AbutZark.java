package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.moswagcytex.samplezark.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AbutZark extends Fragment {
    TextView txt;


    public AbutZark() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_abut_zark, container, false);

        txt=(TextView) v.findViewById(R.id.txt);

        txt.setText("Zark Trade and Distributions, where dreams come true");
        return v;
    }

}
