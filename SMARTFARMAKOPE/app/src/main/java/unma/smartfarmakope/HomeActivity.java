package unma.smartfarmakope;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    private CardView cardview1, cardview2, cardview3, cardview4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        cardview1 = (CardView) findViewById(R.id.cardview1);
        cardview2 = (CardView) findViewById(R.id.cardview2);
        cardview3 = (CardView) findViewById(R.id.cardview3);
        cardview4 = (CardView) findViewById(R.id.cardview4);



        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,PindaiActivity.class);
                startActivity(intent);
            }
        });
        cardview2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(HomeActivity.this,MainActivity.class);
            startActivity(intent);
        }
    });
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });}
}