package com.example.calculorapido;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        this.mViewHolder.button1 = findViewById( R.id.button_1 );
        this.mViewHolder.button2 = findViewById( R.id.button_2 );
        this.mViewHolder.button3 = findViewById( R.id.button_3 );
        this.mViewHolder.button4 = findViewById( R.id.button_4 );

        this.mViewHolder.title = findViewById( R.id.title );
        this.mViewHolder.image_operacao = findViewById( R.id.image_operacao );
        this.mViewHolder.subtitulo = findViewById( R.id.subtitulo );

        this.mViewHolder.button1.setOnClickListener(this);
        this.mViewHolder.button2.setOnClickListener(this);
        this.mViewHolder.button3.setOnClickListener(this);
        this.mViewHolder.button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button_1) {

            Intent intent = new Intent(this, Operacao1.class);
            startActivity( intent );

        } else if(v.getId() == R.id.button_2) {

            Intent intent = new Intent(this, Operacao2.class);
            startActivity( intent );

        } else if(v.getId() == R.id.button_3) {

            Intent intent = new Intent(this, operacao3.class);
            startActivity( intent );

        } else if(v.getId() == R.id.button_4) {

            Intent intent = new Intent(this, Operacao4.class);
            startActivity( intent );
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    private static class ViewHolder {

        TextView title;
        ImageView image_operacao;
        TextView subtitulo;
        Button button1;
        Button button2;
        Button button3;
        Button button4;

    }
}