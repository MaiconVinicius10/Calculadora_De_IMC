package com.example.calculadoradeimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //criando variaveis globais
    private EditText editPeso;
    private EditText editAltura;
    private TextView textResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //criando variaveis receber o que o usuário digitou
        editPeso= findViewById(R.id.editPeso);
        editAltura= findViewById(R.id.editAltura);
        textResultado = findViewById(R.id.textResultado);

    }
    //criando meu metodo calculador
    public void calcularImc(View view){
        //recbendo os dados dentro do metodo calcular
        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());
        /*
         * IMC = PESO/ALTURA*ALTURA
         * */
        double imc= peso/(altura*altura);

        if(imc <16){
            textResultado.setText("Magreza Grave , se alimente melhor seu imc é: "+imc);
        } else if (imc>=16 && imc<16.9) {
            textResultado.setText("Magreza Moderada comer só um pouco melhor ja esta no ideal seu imc é: "+imc);
        } else if (imc>=17 && imc <18.5 ) {
            textResultado.setText("Magreza Leve quse la no ideal imc é: "+imc);
        } else if (imc>=18.6 && imc <24.9) {
            textResultado.setText("Peso Ideal , parabéns pelo o imc seu imc é: "+imc);
        } else if (imc>=25 && imc <29.9) {
            textResultado.setText("Sobrepeso pro favor se cuide seu imc é: "+imc);
        } else {
            textResultado.setText("Obsidade, por favor se cuide seu imc é: "+imc);
        }


    }
}