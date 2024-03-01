package net.thehornyastudio.tebakgambar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View line_logo = findViewById(R.id.line_logo);
        line_logo.setOnClickListener(this);
        View whatsapp_logo = findViewById(R.id.whatsapp_logo);
        whatsapp_logo.setOnClickListener(this);
        View snapchat_logo = findViewById(R.id.snapchat_logo);
        snapchat_logo.setOnClickListener(this);
        View twitter_logo = findViewById(R.id.twitter_logo);
        twitter_logo.setOnClickListener(this);
        View instagram_logo = findViewById(R.id.instagram_logo);
        instagram_logo.setOnClickListener(this);
        View youtube_logo = findViewById(R.id.youtube_logo);
        youtube_logo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String selectedImage;
        if (v.getId() == R.id.line_logo) {
            selectedImage = "line";
            Intent entryImageIntent = new Intent(MainActivity.this, tebakGambar.class);
            entryImageIntent.putExtra("selectedImage", selectedImage);
            startActivity(entryImageIntent);
        } else if (v.getId() == R.id.whatsapp_logo) {
            selectedImage = "whatsapp";
            Intent entryImageIntent = new Intent(MainActivity.this, tebakGambar.class);
            entryImageIntent.putExtra("selectedImage", selectedImage);
            startActivity(entryImageIntent);
        } else if (v.getId() == R.id.snapchat_logo) {
            selectedImage = "snapchat";
            Intent entryImageIntent = new Intent(MainActivity.this, tebakGambar.class);
            entryImageIntent.putExtra("selectedImage", selectedImage);
            startActivity(entryImageIntent);
        } else if (v.getId() == R.id.twitter_logo) {
            selectedImage = "twitter";
            Intent entryImageIntent = new Intent(MainActivity.this, tebakGambar.class);
            entryImageIntent.putExtra("selectedImage", selectedImage);
            startActivity(entryImageIntent);
        } else if (v.getId() == R.id.instagram_logo) {
            selectedImage = "instagram";
            Intent entryImageIntent = new Intent(MainActivity.this, tebakGambar.class);
            entryImageIntent.putExtra("selectedImage", selectedImage);
            startActivity(entryImageIntent);
        } else if (v.getId() == R.id.youtube_logo) {
            selectedImage = "youtube";
            Intent entryImageIntent = new Intent(MainActivity.this, tebakGambar.class);
            entryImageIntent.putExtra("selectedImage", selectedImage);
            startActivity(entryImageIntent);
        }



    }
}