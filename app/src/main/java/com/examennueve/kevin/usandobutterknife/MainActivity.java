package com.examennueve.kevin.usandobutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.TextView1)
    TextView texto1;
    @Bind(R.id.TextView2)
    TextView texto2;
    @Bind(R.id.TextView3)
    TextView texto3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        texto1.setText(R.string.texto_one);
        texto2.setText(R.string.texto_one);
        texto3.setText(R.string.texto_one);
    }

    @OnClick(R.id.btn_button)
    public void boton(){
        Toast.makeText(this, R.string.toast,Toast.LENGTH_SHORT).show();
    }
}
