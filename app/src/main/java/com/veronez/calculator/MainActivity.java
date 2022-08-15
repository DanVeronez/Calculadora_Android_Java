package com.veronez.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button numeroZero, numeroUm, numeroDois, numeroTres, numeroQuatro, numeroCinco, numeroSeis, numeroSete,
            numeroOito, numeroNove, ponto, soma, subritacao, multiplicacao, divisao, igual, botao_Limpar;

    private TextView txtExprecao, txtResultado;

    private ImageView backspace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
    }

    private void iniciarComponentes(){

        numeroZero      = findViewById(R.id.numero_zero);
        numeroUm        = findViewById(R.id.numero_um);
        numeroDois      = findViewById(R.id.numero_dois);
        numeroTres      = findViewById(R.id.numero_tres);
        numeroQuatro    = findViewById(R.id.numero_quatro);
        numeroCinco     = findViewById(R.id.numero_cinco);
        numeroSeis      = findViewById(R.id.numero_seis);
        numeroSete      = findViewById(R.id.numero_sete);
        numeroOito      = findViewById(R.id.numero_oito);
        numeroNove      = findViewById(R.id.numero_nove);
        ponto           = findViewById(R.id.ponto);
        soma            = findViewById(R.id.soma);
        subritacao      = findViewById(R.id.subitracao);
        multiplicacao   = findViewById(R.id.multiplicacao);
        divisao         = findViewById(R.id.divisao);
        igual           = findViewById(R.id.igual);
        botao_Limpar    = findViewById(R.id.bt_limpar);
        txtExprecao     = findViewById(R.id.txt_expressao);
        txtResultado    = findViewById(R.id.txt_resultado);
        backspace       = findViewById(R.id.backspace);


    }

    public void acrescentarUmaExprecao(String string, Boolean limpar_dados){

        if (txtResultado.getText().equals("")){
            txtExprecao.setText("");
        }

        if (limpar_dados){
            txtResultado.setText("");
            txtExprecao.append(string);
        }else{
            txtExprecao.append(txtResultado.getText());
            txtExprecao.append(string);
        }

    }
}