package jagminder.sembi.N01300801;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

public class SembiActivityApt extends AppCompatActivity {

    private CheckBox ch1,ch2,ch3,ch4;
    private ImageButton i_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sembi_detached);

        ch1 = findViewById(R.id.checkBox);
        ch2 = findViewById(R.id.checkBox2);
        ch3 = findViewById(R.id.checkBox3);
        ch4 = findViewById(R.id.checkBox4);

        i_button = findViewById(R.id.imagebutton);

        i_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ch1.isChecked()){

                    Toast.makeText(SembiActivityApt.this,"Selected Apartment 1",Toast.LENGTH_SHORT).show();
                }

                if(ch2.isChecked()){

                    Toast.makeText(SembiActivityApt.this,"Selected Apartment  2",Toast.LENGTH_SHORT).show();
                }
                if(ch3.isChecked()){

                    Toast.makeText(SembiActivityApt.this,"Selected Apartment  3",Toast.LENGTH_SHORT).show();
                }
                if(ch4.isChecked()){

                    Toast.makeText(SembiActivityApt.this,"Selected Apartment  4",Toast.LENGTH_SHORT).show();
                }

            }
        });




    }}
