package assalaam.projetc.id.tatacarakurban;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity  implements View.OnClickListener{

    Button keluar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        keluar = (Button) findViewById(R.id.exitBtn);
        keluar.setOnClickListener(this);

        Button ll = (Button) findViewById(R.id.alat);
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View alat) {
                Intent myIntent = new
                        Intent(alat.getContext(), Alat.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button rls = (Button) findViewById(R.id.cara);
        rls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View cara) {
                Intent myIntent = new
                        Intent(cara.getContext(), Cara.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button wv = (Button) findViewById(R.id.webview);
        wv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View webview) {
                Intent myIntent = new
                        Intent(webview.getContext(), Webview.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button pl = (Button) findViewById(R.id.profil);
        pl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View profil) {
                Intent myIntent = new
                        Intent(profil.getContext(), profil.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button gg = (Button) findViewById(R.id.rukun);
        gg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rukun) {
                Intent myIntent = new
                        Intent(rukun.getContext(), rukun.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button hh = (Button) findViewById(R.id.doa);
        hh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View doa) {
                Intent myIntent = new
                        Intent(doa.getContext(), Doa.class);
                startActivityForResult(myIntent, 0);

            }
        });
    }
    public void onClick(View clicked) {
        switch (clicked.getId()) {
            case R.id.exitBtn:
                exit();
                break;
        }
    }

    private void exit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah Kamu Benar-Benar Ingin Keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Home.this.finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int arg1) {
                        dialog.cancel();
                    }
                }).show();
    }
}
