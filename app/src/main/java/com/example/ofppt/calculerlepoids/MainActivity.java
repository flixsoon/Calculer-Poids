

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText t;
    RadioButton r1;
    RadioButton r2;
    EditText result;
    Button b,a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t=(EditText) findViewById(R.id.t);
        r1=(RadioButton) findViewById(R.id.r1);
        r2=(RadioButton) findViewById(R.id.r2);
        result=(EditText) findViewById(R.id.result);
        b=(Button) findViewById(R.id.b);
        a=(Button) findViewById(R.id.a);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double taille= Integer.parseInt(t.getText()+"");

                if(r1.isChecked()) {
                    double f = (taille - 100 - (taille - 150) / 2.5);
                    result.setText(f+"");
                }

                if(r2.isChecked()) {
                    double h = (taille - 100 - (taille - 150) / 4);
                    result.setText(h+"");
                }
            }
        });

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("");
                result.setText("");
            }
        });
    }
}
