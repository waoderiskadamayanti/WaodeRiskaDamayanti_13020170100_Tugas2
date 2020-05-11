package com.example.assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Main3Activity extends AppCompatActivity {
LinearLayout btnLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button btnLayout = (Button)findViewById(R.id.btnPindah) ;
btnLayout.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(Main3Activity.this, Main4Activity.class));
    }
});
    }
}
