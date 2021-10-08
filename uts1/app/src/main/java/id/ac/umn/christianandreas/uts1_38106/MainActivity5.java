package id.ac.umn.christianandreas.uts1_38106;

import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    TextView textViewJudul, textViewPenyanyi;
    MediaPlayer mediaPlayer;
    Resources identifier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button playsfx = findViewById(R.id.playsfx);
        textViewJudul = findViewById(R.id.tvJudul);
        textViewPenyanyi = findViewById(R.id.tvPenyanyi);

        Lagu lagu = getIntent().getParcelableExtra("LAGU");
        textViewJudul.setText(lagu.getJudul());
        textViewPenyanyi.setText(lagu.getPenyanyi());

        String tes = lagu.getLaguURI();

        playsfx.setOnClickListener(v -> {
            identifier = getResources();


            int sumberlagu = identifier.getIdentifier(String.valueOf(tes),"raw", getPackageName());
            try {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), sumberlagu);
                mediaPlayer.setOnCompletionListener(MediaPlayer::release);
                mediaPlayer.start();
            }catch (Exception ignored) {

            }

        });

    }
    protected void onStop() {
        super.onStop();
        try {
            mediaPlayer.release();
        }catch (Exception e){

        }
    }
}