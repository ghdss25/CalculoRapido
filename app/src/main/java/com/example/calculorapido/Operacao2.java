package com.example.calculorapido;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Operacao2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_operacao2 );
    }

    public void Calculo(View v) {

        Random rand = new Random();

        int x = rand.nextInt(100);
        int y = rand.nextInt(100);

        TextView Conta = findViewById( R.id.Conta );
        Conta.setText( x + " + "  + y );

        int soma = x + y;

        TextView Situacao = findViewById( R.id.Situacao );
        Situacao.setText( "Soma: " + soma );
    }

    public void Calculo_Multiplicar(View v1) {

        Random rand = new Random();

        int x = rand.nextInt(100);
        int y = rand.nextInt(100);

        TextView Conta1 = findViewById( R.id.Conta1 );
        Conta1.setText( x + " * "  + y );

        int mult = x * y;

        TextView Situacao1 = findViewById( R.id.Situacao1 );
        Situacao1.setText("Multiplica: " + mult );
    }

    public void Calculo_Divisao(View v2) {

        Random rand = new Random();

        int x = rand.nextInt(1000);
        int y = rand.nextInt(100);

        TextView Conta2 = findViewById( R.id.Conta2 );
        Conta2.setText( x + " / "  + y );

        int div = x / y;

        TextView Situacao2 = findViewById( R.id.Situacao2 );
        Situacao2.setText( "Divisão: " + div );
    }

    public void Calculo_Subtracao(View v3) {

        Random rand = new Random();

        int x = rand.nextInt(100);
        int y = rand.nextInt(100);

        TextView Conta4 = findViewById( R.id.Conta4 );
        Conta4.setText( x + " - "  + y );

        int sub = x - y;

        TextView Situacao4 = findViewById( R.id.Situacao4 );
        Situacao4.setText("Subtração: " + sub );
    }
}