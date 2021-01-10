package com.example.calculorapido;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Operacao4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_operacao4 );
    }

    public void Calculo(View v) {

        Random rand = new Random();

        int x = rand.nextInt(10000);
        int y = rand.nextInt(10000);

        TextView Conta = findViewById( R.id.Conta );
        Conta.setText( x + " + "  + y );

        int soma = x + y;

        TextView Situacao = findViewById( R.id.Situacao );
        Situacao.setText( "Soma: " + String.format("%.2f", soma));
    }

    public void Calculo_Multiplicar(View v1) {

        Random rand = new Random();

        int x = rand.nextInt(10000);
        int y = rand.nextInt(10000);

        TextView Conta1 = findViewById( R.id.Conta1 );
        Conta1.setText( x + " * "  + y );

        int mult = x * y;

        TextView Situacao1 = findViewById( R.id.Situacao1 );
        Situacao1.setText( "Multiplicação: " + String.format("%.2f", mult));
    }

    public void Calculo_Divisao(View v2) {

        Random rand = new Random();

        int x = rand.nextInt(100000);
        int y = rand.nextInt(10000);

        TextView Conta2 = findViewById( R.id.Conta2 );
        Conta2.setText( x + " / "  + y );

        int div = x / y;

        TextView Situacao2 = findViewById( R.id.Situacao2 );
        Situacao2.setText( "Divisão: " + String.format("%.2f", div));
    }

    public void Calculo_Subtracao(View v3) {

        Random rand = new Random();

        int x = rand.nextInt(10000);
        int y = rand.nextInt(10000);

        TextView Conta4 = findViewById( R.id.Conta4 );
        Conta4.setText( x + " - "  + y );

        int sub = x - y;

        TextView Situacao4 = findViewById( R.id.Situacao4 );
        Situacao4.setText("Subtração: " + String.format("%.2f", sub));
    }

    public void Calculo_Potencia(View v4) {

        Random rand = new Random();
        double potencia = 0;

        int x = rand.nextInt(10000);

        TextView Conta5 = findViewById(R.id.Conta5);
        Conta5.setText("Potência de x ao quadrado: " + x);

        potencia = Math.pow(x,2);

        TextView Situacao5 = findViewById( R.id.Situacao5);
        Situacao5.setText("Resposta: " + String.format("%.2f", potencia));
    }

    public void Calculo_Raiz_Quadrada(View v5) {

        Random random = new Random();

        int x = random.nextInt(10000);

        TextView Conta6 = findViewById(R.id.Conta6);
        Conta6.setText("Raiz Quadrada de x é: " + x);

        double rq = Math.sqrt(x);

        TextView Situacao6 = findViewById( R.id.Situacao6);
        Situacao6.setText("Resposta: " + String.format("%.2f", rq));
    }

    public void Calculo_Raiz_Cúbica(View v6) {

        Random random = new Random();

        int x = random.nextInt(10000);

        TextView Conta7 = findViewById( R.id.Conta7);
        Conta7.setText(" Raiz Cúbica de : " + x);

        double rc = Math.cbrt(x);

        TextView Situacao7 = findViewById( R.id.Situacao7);
        Situacao7.setText("Resposta: " + String.format("%.2f", rc));
    }
}