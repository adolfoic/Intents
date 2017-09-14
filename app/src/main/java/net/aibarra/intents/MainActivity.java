package net.aibarra.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt_ir =(Button) findViewById(R.id.bt_ir);
        bt_ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzaintent();
            }
        });

    }

    public void lanzaintent() {
        EditText et_caja1 = (EditText)findViewById(R.id.et_caja1);

        Intent intencion_ir = new Intent(this,SegundoActivity.class);
        intencion_ir.putExtra("parametro", et_caja1.getText().toString());
        startActivity(intencion_ir);
    }
}
