package com.example.kopapirollo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView jatekoskep, gepkep;
    private TextView eredmenyszoveg;
    private Button kogomb, ollogomb, papirgomb;
    private int emberszamlalo;
    private int gepszamlalo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    kogomb.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            jatekoskep.setImageResource(R.drawable.rock);

            int random = (int) (Math.random()*3+1);

            if (random ==1)
            {
                gepkep.setImageResource(R.drawable.rock);
                Toast.makeText(MainActivity.this, "Döntetlen!", Toast.LENGTH_SHORT).show();
            } else if (random ==2)
            {
                gepkep.setImageResource(R.drawable.scissors);
                Toast.makeText(MainActivity.this, "Ember nyert!", Toast.LENGTH_SHORT).show();
                emberszamlalo++;
                eredmenyszoveg.setText(String.format("Eredmény: Ember: %d Computer: %d", emberszamlalo, gepszamlalo));

            } else {

                    gepkep.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "Gép nyert!", Toast.LENGTH_SHORT).show();
                    gepszamlalo++;
                eredmenyszoveg.setText(String.format("Eredmény: Ember: %d Computer: %d", emberszamlalo, gepszamlalo));

            }
            if (emberszamlalo ==3 || gepszamlalo==3)
            {

                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                if (emberszamlalo==3) {
                    builder1.setTitle("Győzelem!");
                }
                else {
                    builder1.setTitle("Vereség");
                }

                builder1.setMessage("Szeretne új játékot kezdeni?");
                builder1.setCancelable(false);

                builder1.setPositiveButton(
                        "Igen",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                emberszamlalo =0;
                                gepszamlalo =0;
                                jatekoskep.setImageResource(R.drawable.rock);
                                gepkep.setImageResource(R.drawable.rock);
                                eredmenyszoveg.setText(String.format("Eredmény: Ember: %d Computer: %d", emberszamlalo, gepszamlalo));
                            }
                        });

                builder1.setNegativeButton(
                        "Nem",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                finish();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();


            }

        }
    });


    papirgomb.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            jatekoskep.setImageResource(R.drawable.paper);

            int random = (int) (Math.random()*3+1);

            if (random ==1)
            {
                gepkep.setImageResource(R.drawable.rock);
                Toast.makeText(MainActivity.this, "Ember nyert!", Toast.LENGTH_SHORT).show();
                emberszamlalo++;
                eredmenyszoveg.setText(String.format("Eredmény: Ember: %d Computer: %d", emberszamlalo, gepszamlalo));

            } else if (random ==2)
            {
                gepkep.setImageResource(R.drawable.scissors);
                Toast.makeText(MainActivity.this, "Gép nyert!", Toast.LENGTH_SHORT).show();
                gepszamlalo++;
                eredmenyszoveg.setText(String.format("Eredmény: Ember: %d Computer: %d", emberszamlalo, gepszamlalo));

            } else {

                gepkep.setImageResource(R.drawable.paper);
                Toast.makeText(MainActivity.this, "Döntetlen!", Toast.LENGTH_SHORT).show();


            }
            if (emberszamlalo ==3 || gepszamlalo==3)
            {

                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                if (emberszamlalo==3) {
                    builder1.setTitle("Győzelem!");
                }
                else {
                    builder1.setTitle("Vereség");
                }

                builder1.setMessage("Szeretne új játékot kezdeni?");
                builder1.setCancelable(false);

                builder1.setPositiveButton(
                        "Igen",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                emberszamlalo =0;
                                gepszamlalo =0;
                                jatekoskep.setImageResource(R.drawable.rock);
                                gepkep.setImageResource(R.drawable.rock);
                                eredmenyszoveg.setText(String.format("Eredmény: Ember: %d Computer: %d", emberszamlalo, gepszamlalo));
                            }
                        });

                builder1.setNegativeButton(
                        "Nem",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                finish();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();


            }


        }
    });


    ollogomb.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            jatekoskep.setImageResource(R.drawable.scissors);

            int random = (int) (Math.random()*3+1);

            if (random ==1)
            {
                gepkep.setImageResource(R.drawable.rock);
                Toast.makeText(MainActivity.this, "Gép nyert!", Toast.LENGTH_SHORT).show();
                gepszamlalo++;
                eredmenyszoveg.setText(String.format("Eredmény: Ember: %d Computer: %d", emberszamlalo, gepszamlalo));

            } else if (random ==2)
            {
                gepkep.setImageResource(R.drawable.scissors);
                Toast.makeText(MainActivity.this, "Döntetlen!", Toast.LENGTH_SHORT).show();


            } else {

                gepkep.setImageResource(R.drawable.paper);
                Toast.makeText(MainActivity.this, "Ember nyert", Toast.LENGTH_SHORT).show();
                emberszamlalo++;
                eredmenyszoveg.setText(String.format("Eredmény: Ember: %d Computer: %d", emberszamlalo, gepszamlalo));


            }
            if (emberszamlalo ==3 || gepszamlalo==3)
            {

                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                if (emberszamlalo==3) {
                    builder1.setTitle("Győzelem!");
                }
                else {
                    builder1.setTitle("Vereség");
                }

                builder1.setMessage("Szeretne új játékot kezdeni?");
                builder1.setCancelable(false);

                builder1.setPositiveButton(
                        "Igen",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                emberszamlalo =0;
                                gepszamlalo =0;
                                jatekoskep.setImageResource(R.drawable.rock);
                                gepkep.setImageResource(R.drawable.rock);
                                eredmenyszoveg.setText(String.format("Eredmény: Ember: %d Computer: %d", emberszamlalo, gepszamlalo));
                            }
                        });

                builder1.setNegativeButton(
                        "Nem",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                finish();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();


            }
        }
    });






    }

    private void init(){
        this.jatekoskep = findViewById(R.id.jatekoskep);
        this.gepkep = findViewById(R.id.gepkep);
        this.eredmenyszoveg = findViewById(R.id.eredmenyfelirat);
        this.kogomb = findViewById(R.id.kogomb);
        this.ollogomb = findViewById(R.id.ollogomb);
        this.papirgomb = findViewById(R.id.papirgomb);
        emberszamlalo =0;
        gepszamlalo = 0;



    }


}