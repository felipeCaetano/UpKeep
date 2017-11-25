package UFRPE.upkeepxpteam.upkeepxp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Historia2Activity extends AppCompatActivity {

    private Button btnSalvar;
    private TextView tvExibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia2);

        btnSalvar = (Button) findViewById(R.id.bt_salvar);
        tvExibir = (TextView) findViewById(R.id.tv_exibir);
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvExibir.setText("Botão Clicado");
            }
        });
    }
}
K