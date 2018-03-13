package com.example.bradi.ejercicio03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    ImageView i;
    RadioGroup g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        i=findViewById(R.id.imageView);
        g=findViewById(R.id.grupo1);


        g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int pais) {
                switch(pais)
                {
                    case R.id.idperu:
                        i.setImageResource(R.drawable.peru );
                        break;
                    case R.id.idbrasil :
                        i.setImageResource(R.drawable.brasil );
                        break;
                    case R.id.ideeuu :
                        i.setImageResource(R.drawable.eeuu);
                        break;

                    case R.id.idalemania:
                        i.setImageResource(R.drawable.alemania );
                        break;



                }
            }
        });

    }
}
