package com.cursoandroid.idadedecachorro.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = findViewById(R.id.caixaTextoId);
        botaoIdade = findViewById(R.id.botaoIdadeId);
        resultadoIdade = findViewById(R.id.resultadoIdadeId);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Recuperar o que foi digitado
                String textoDigitado = caixaTexto.getText().toString();

                if (textoDigitado.isEmpty()) {

                    // Mensagem de erro, string vazia.
                    resultadoIdade.setText("Nenhum número foi digitado!!");


                } else {

                    int valorDigitado = Integer.parseInt(textoDigitado);

                    if (valorDigitado > 20 || valorDigitado < 1) {

                        resultadoIdade.setText("Digite a idade permitida: entre 1 e 20 anos!");

                    } else {

                        int resultadoFinal = valorDigitado * 7;
                        resultadoIdade.setText("A idade do cachorro em anos humanos é: " + resultadoFinal + " anos.");

                    }

                }

            }
        });

    }
}
