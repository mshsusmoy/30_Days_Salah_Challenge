package rktuhinbd.salahchallenge.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

import rktuhinbd.salahchallenge.R;

public class SalahChallengeActivity extends AppCompatActivity {

    private Button btDay1, btDay2, btDay3, btDay4, btDay5, btDay6, btDay7, btDay8, btDay9, btDay10, btDay11, btDay12, btDay13, btDay14, btDay15, btDay16, btDay17, btDay18, btDay19, btDay20, btDay21, btDay22, btDay23, btDay24, btDay25, btDay26, btDay27, btDay28, btDay29, btDay30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salah_challenge);

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Salah Challenge");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btDay1 = findViewById(R.id.btn_one);
        btDay2 = findViewById(R.id.btn_two);
        btDay3 = findViewById(R.id.btn_three);
        btDay4 = findViewById(R.id.btn_four);
        btDay5 = findViewById(R.id.btn_five);
        btDay6 = findViewById(R.id.btn_six);
        btDay7 = findViewById(R.id.btn_seven);
        btDay8 = findViewById(R.id.btn_eight);
        btDay9 = findViewById(R.id.btn_nine);
        btDay10 = findViewById(R.id.btn_ten);
        btDay11 = findViewById(R.id.btn_eleven);
        btDay12 = findViewById(R.id.btn_twelve);
        btDay13 = findViewById(R.id.btn_thirteen);
        btDay14 = findViewById(R.id.btn_fourteen);
        btDay15 = findViewById(R.id.btn_fifteen);
        btDay16 = findViewById(R.id.btn_sixteen);
        btDay17 = findViewById(R.id.btn_seventeen);
        btDay18 = findViewById(R.id.btn_eighteen);
        btDay19 = findViewById(R.id.btn_nineteen);
        btDay20 = findViewById(R.id.btn_twenty);
        btDay21 = findViewById(R.id.btn_twenty_one);
        btDay22 = findViewById(R.id.btn_twenty_two);
        btDay23 = findViewById(R.id.btn_twenty_three);
        btDay24 = findViewById(R.id.btn_twenty_four);
        btDay25 = findViewById(R.id.btn_twenty_five);
        btDay26 = findViewById(R.id.btn_twenty_six);
        btDay27 = findViewById(R.id.btn_twenty_seven);
        btDay28 = findViewById(R.id.btn_twenty_eight);
        btDay29 = findViewById(R.id.btn_twenty_nine);
        btDay30 = findViewById(R.id.btn_thirty);


        btDay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 1);
                startActivity(intent);
            }
        });

        btDay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 2);
                startActivity(intent);
            }
        });

        btDay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 3);
                startActivity(intent);
            }
        });

        btDay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 4);
                startActivity(intent);
            }
        });

        btDay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 5);
                startActivity(intent);
            }
        });

        btDay6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 6);
                startActivity(intent);
            }
        });

        btDay7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 7);
                startActivity(intent);
            }
        });

        btDay8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 8);
                startActivity(intent);
            }
        });

        btDay9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 9);
                startActivity(intent);
            }
        });

        btDay10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 10);
                startActivity(intent);
            }
        });

        btDay11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 11);
                startActivity(intent);
            }
        });

        btDay12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 12);
                startActivity(intent);
            }
        });

        btDay13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 13);
                startActivity(intent);
            }
        });

        btDay14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 14);
                startActivity(intent);
            }
        });

        btDay15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 15);
                startActivity(intent);
            }
        });

        btDay16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 16);
                startActivity(intent);
            }
        });

        btDay17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 17);
                startActivity(intent);
            }
        });

        btDay18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 18);
                startActivity(intent);
            }
        });

        btDay19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 19);
                startActivity(intent);
            }
        });

        btDay20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 20);
                startActivity(intent);
            }
        });

        btDay21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 21);
                startActivity(intent);
            }
        });

        btDay22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 22);
                startActivity(intent);
            }
        });

        btDay23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 23);
                startActivity(intent);
            }
        });

        btDay24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 24);
                startActivity(intent);
            }
        });

        btDay25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 25);
                startActivity(intent);
            }
        });

        btDay26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 26);
                startActivity(intent);
            }
        });

        btDay27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 27);
                startActivity(intent);
            }
        });

        btDay28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 28);
                startActivity(intent);
            }
        });

        btDay29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 29);
                startActivity(intent);
            }
        });

        btDay30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalahInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("day", 30);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}