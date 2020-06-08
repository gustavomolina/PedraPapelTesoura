package com.example.pedrapapeltesoura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView TextoResultado;
    private ImageView pedra;
    private ImageView papel;
    private ImageView tesoura;
    private ImageView resultado;
    public int escolha = 0;

    Random ale;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pedra = findViewById(R.id.im_pedra);
        papel = findViewById(R.id.im_papel);
        tesoura = findViewById(R.id.im_tesoura);
        resultado = findViewById(R.id.im_escolha);

        TextoResultado = findViewById(R.id.tx_resultado);

        pedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escolha = 1;
                Random ale = new Random();
                int sorteado = ale.nextInt(3);

                sorteado = sorteado +1;
                if (sorteado == 1) { //Sorteou pedra
                    resultado.setImageResource(R.drawable.pedra);
                    TextoResultado.setText("Empatou!");

                }
                if (sorteado == 2) { //Sorteou papel
                    resultado.setImageResource(R.drawable.papel);
                    TextoResultado.setText("Perdeu!");

                }
                if (sorteado == 3) { //Sorteou tesoura
                    resultado.setImageResource(R.drawable.tesoura);
                    TextoResultado.setText("Ganhou!!");

                }

            }
        });
        papel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                escolha = 2;
                Random ale = new Random();
                int sorteado = ale.nextInt(3);

                sorteado = sorteado +1;
                if (sorteado == 1) { //Sorteou pedra
                    resultado.setImageResource(R.drawable.pedra);
                    TextoResultado.setText("Ganhou!");

                }
                if (sorteado == 2) { //Sorteou papel
                    resultado.setImageResource(R.drawable.papel);
                    TextoResultado.setText("Empatou!");

                }
                if (sorteado == 3) { //Sorteou tesoura
                    resultado.setImageResource(R.drawable.tesoura);
                    TextoResultado.setText("Perdeu!");
                }
            }
        });
        tesoura.setOnClickListener(new View.OnClickListener()   {;
        @Override
            public void onClick(View v){
                escolha = 3;
                Random ale = new Random();
                int sorteado = ale.nextInt(3);

                sorteado = sorteado +1;
                if (sorteado == 1) { //Sorteou pedra
                    resultado.setImageResource(R.drawable.pedra);
                    TextoResultado.setText("Perdeu!");

                }
                if (sorteado == 2) { //Sorteou papel
                    resultado.setImageResource(R.drawable.papel);
                    TextoResultado.setText("Ganhou!");

                }
                if (sorteado == 3) { //Sorteou tesoura
                    resultado.setImageResource(R.drawable.tesoura);
                    TextoResultado.setText("Empatou!");

                }
            }
        });



    }
}
