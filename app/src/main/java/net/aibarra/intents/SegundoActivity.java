package net.aibarra.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        Bundle extras = getIntent().getExtras();
        if (extras!=null) {
            String valor = extras.getString("parametro");
            EditText et_caja2 = (EditText) findViewById(R.id.et_caja2);
            et_caja2.setText(valor);
        }

        Button bt_volver = (Button) findViewById(R.id.bt_volver);
        bt_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzaintent();
            }
        });
    }

    public void lanzaintent() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
