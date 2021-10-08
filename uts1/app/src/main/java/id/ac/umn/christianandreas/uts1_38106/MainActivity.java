package id.ac.umn.christianandreas.uts1_38106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button profile = findViewById(R.id.profile);
        profile.setOnClickListener(this);
        Button login = findViewById(R.id.login);
        login.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.profile) {
            Intent Intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(Intent);
        }
        else if (v.getId() == R.id.login) {
            Intent Intent = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(Intent);
        }
    }
}