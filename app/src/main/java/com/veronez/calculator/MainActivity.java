package com.veronez.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button numeroZero, numeroUm, numeroDois, numeroTres, numeroQuatro, numeroCinco, numeroSeis, numeroSete,
            numeroOito, numeroNove, ponto, soma, subritacao, multiplicacao, divisao, igual, botao_Limpar;

    private TextView txtExprecao, txtResultado;

    private ImageView backspace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        numeroZero.setOnClickListener(this);
        numeroUm.setOnClickListener(this);
        numeroDois.setOnClickListener(this);
        numeroTres.setOnClickListener(this);
        numeroQuatro.setOnClickListener(this);
        numeroCinco.setOnClickListener(this);
        numeroSeis.setOnClickListener(this);
        numeroSete.setOnClickListener(this);
        numeroOito.setOnClickListener(this);
        numeroNove.setOnClickListener(this);
        ponto.setOnClickListener(this);
        soma.setOnClickListener(this);
        subritacao.setOnClickListener(this);
        multiplicacao.setOnClickListener(this);
        divisao.setOnClickListener(this);

        botao_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtExprecao.setText("");
                txtResultado.setText("");
            }
        });
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

    public void AcrescentarUmaExprecao(String string, Boolean limpar_dados){

        if (txtResultado.getText().equals("")){
            txtExprecao.setText("");
        }

        if (limpar_dados){
            txtResultado.setText("");
            txtExprecao.append(string);
        }else{
            txtExprecao.append(txtResultado.getText());
            txtExprecao.append(string);
            txtResultado.setText("");
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.numero_zero:
                AcrescentarUmaExprecao("0",true);
                break;

            case R.id.numero_um:
                AcrescentarUmaExprecao("1",true);
                break;

            case R.id.numero_tres:
                AcrescentarUmaExprecao("3", true);
                break;

            case R.id.numero_quatro:
                AcrescentarUmaExprecao("4", true);
                break;

            case R.id.numero_cinco:
                AcrescentarUmaExprecao("5", true);
                break;

            case R.id.numero_seis:
                AcrescentarUmaExprecao("6", true);
                break;

            case R.id.numero_sete:
                AcrescentarUmaExprecao("7", true);
                break;

            case R.id.numero_oito:
                AcrescentarUmaExprecao("8", true);
                break;

            case R.id.numero_nove:
                AcrescentarUmaExprecao("9", true);
                break;

            case R.id.ponto:
                AcrescentarUmaExprecao(".", true);
                break;

            case R.id.soma:
                AcrescentarUmaExprecao("+", false);
                break;

            case R.id.subitracao:
                AcrescentarUmaExprecao("-", false);
                break;

            case R.id.multiplicacao:
                AcrescentarUmaExprecao("*", false);
                break;

            case R.id.divisao:
                AcrescentarUmaExprecao("/", false);
                break;
        }
    }
}