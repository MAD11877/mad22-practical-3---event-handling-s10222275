package sg.np.edu.mad.madpractical;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageView v = findViewById(R.id.imagebutton);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ListActivity.this);

                builder.setTitle("Profile");
                builder.setMessage("MADness");

                builder.setPositiveButton("View", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        Random rand = new Random(); //instance of random class


                        int int_random = rand.nextInt();
                        int randomi = int_random;
                        Bundle extras = new Bundle();
                        extras.putInt("RandomNumber",randomi);

                        Intent MainActivity = new Intent(ListActivity.this, MainActivity.class);
                        MainActivity.putExtras(extras);
                        startActivity(MainActivity);

                    }
                });
                builder.setNegativeButton("Close", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){


                    }
                });
                builder.show();

            }
        });
            }
}

