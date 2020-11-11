package jagminder.sembi.N01300801;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class JagminderActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jagminder2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.SembiApartment:
                Intent intent  = new Intent(JagminderActivity2.this,SembiActivityApt.class);
                startActivity(intent);
                Toast.makeText(this, "Apartment selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.SembiDetached:
                Intent intent1  = new Intent(JagminderActivity2.this,SembiActivityDetached.class);
                startActivity(intent1);
                Toast.makeText(this, "Detached selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.SembiSemiDetached:
                Intent intent2  = new Intent(JagminderActivity2.this,SembiActivitySemiDetached.class);
                startActivity(intent2);
                Toast.makeText(this, "SemiDetached selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }
    }