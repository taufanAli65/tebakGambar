package net.thehornyastudio.tebakgambar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class tebakGambar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak_gambar);

        Intent intent = getIntent();
        String selectedImage = intent.getStringExtra("selectedImage");
        ImageView imageView = findViewById(R.id.guessImage);
        switch (selectedImage) {
            case "line":
                imageView.setImageResource(R.drawable.line);
                break;
            case "whatsapp":
                imageView.setImageResource(R.drawable.whatsapp);
                break;
            case "snapchat":
                imageView.setImageResource(R.drawable.snapchat);
                break;
            case "twitter":
                imageView.setImageResource(R.drawable.twitter);
                break;
            case "instagram":
                imageView.setImageResource(R.drawable.instagram);
                break;
            case "youtube":
                imageView.setImageResource(R.drawable.youtube);
                break;
            default:
                imageView.setImageResource(R.drawable.whatsapp);
                break;
        }

        Button cekButton = findViewById(R.id.cek_button);
        EditText jawabanEditText = findViewById(R.id.jawaban_user);

        cekButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mendapatkan jawaban dari EditText
                String jawaban = jawabanEditText.getText().toString();

                if (jawaban.toLowerCase().equals(selectedImage)) {
                    Toast.makeText(tebakGambar.this, "Jawaban Benar!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(tebakGambar.this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}