package id.ac.umn.christianandreas.uts1_38106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{

    private EditText namaInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button next = findViewById(R.id.next);
        next.setOnClickListener(this);
        namaInput = (EditText)this.findViewById((R.id.namaInput));
        next.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if (namaInput.length()==0) {
            namaInput.setError("Harap diisi");}
        else {
            Intent Intent = new Intent(MainActivity3.this, MainActivity4.class);
            startActivity(Intent);
        }
    }
}