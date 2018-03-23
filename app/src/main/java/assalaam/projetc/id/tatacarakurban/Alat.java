package assalaam.projetc.id.tatacarakurban;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alat);

        Button aa = (Button) findViewById(R.id.tali);
        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View tali) {
                Intent myIntent = new
                        Intent(tali.getContext(), Tali.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button bb = (Button) findViewById(R.id.golok);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View golok) {
                Intent myIntent = new
                        Intent(golok.getContext(), Golok.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button cc = (Button) findViewById(R.id.pisau);
        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View golok) {
                Intent myIntent = new
                        Intent(golok.getContext(), Pisau.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button dd = (Button) findViewById(R.id.kampak);
        dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View golok) {
                Intent myIntent = new
                        Intent(golok.getContext(), Kampak.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button ee = (Button) findViewById(R.id.timbang);
        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View golok) {
                Intent myIntent = new
                        Intent(golok.getContext(), Timbang.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button ff = (Button) findViewById(R.id.keresek);
        ff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View golok) {
                Intent myIntent = new
                        Intent(golok.getContext(), Keresek.class);
                startActivityForResult(myIntent, 0);

            }
        });

    }
}

