package id.firodev.tebakbuah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class TebakActivity extends AppCompatActivity {

    ImageView imageView_tebak;
    EditText editText_jawabb;
    Button button_cek;

    String jawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak);


        setInitalisasi();
        cekIntent();
        onClickJos();
    }

    private void onClickJos() {
        button_cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText_jawabb.getText().toString().equals(jawaban)){
                    Toast.makeText(TebakActivity.this,"Yee Benar!",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(TebakActivity.this,"oo Salah!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void cekIntent() {
        Intent cek = getIntent();
        String nama_buah = cek.getStringExtra("nama_buah");

        if (nama_buah.equals("alpukat")){
            imageView_tebak.setImageResource(R.drawable.alpukat);
            jawaban = "alpukat";

        } else if (nama_buah.equals("apel")){
            imageView_tebak.setImageResource(R.drawable.apel);
            jawaban = "apel";
        } else if (nama_buah.equals("durian")){
            imageView_tebak.setImageResource(R.drawable.durian);
            jawaban = "durian";
        } else {
            imageView_tebak.setImageResource(R.drawable.ceri);
            jawaban = "ceri";
        }

    }

    private void setInitalisasi() {
        imageView_tebak = (ImageView)findViewById(R.id.imageView_tebak);
        editText_jawabb = (EditText)findViewById(R.id.editText_jawab);
        button_cek = (Button)findViewById(R.id.buttonCek);
    }
}
