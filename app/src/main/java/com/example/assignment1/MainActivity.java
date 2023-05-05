package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    private ImageButton dama;
    private ImageButton ball;
    private ImageButton nail;
    private ImageButton orga;
    private ImageButton moltawyeh;
    TextView cancel_text;
    TextView info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DAbacteria bacterias=new DAbacteria();
        setContentView(R.layout.activity_main);
        Dialog dialog = new Dialog(MainActivity.this);
        dama = findViewById(R.id.dama);
        ball = findViewById(R.id.ball);
        nail = findViewById(R.id.nail);
        orga = findViewById(R.id.orga);
        moltawyeh = findViewById(R.id.moltawyeh);

        ball.setTransitionName("ball");
        moltawyeh.setTransitionName("moltawyeh");
        dama.setTransitionName("dama");
        nail.setTransitionName("nail");
        orga.setTransitionName("orga");

        dama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.setContentView(R.layout.dialog);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);
                dialog.getWindow().getAttributes().windowAnimations = R.style.animation;
                cancel_text = dialog.findViewById(R.id.cancel_text);
                info = dialog.findViewById(R.id.info);
                info.setText(bacterias.getbacteriaByname(dama.getTransitionName()).getInformation());
                cancel_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "Cancel clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();

            }
        });
        ball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.setContentView(R.layout.dialog);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);
                dialog.getWindow().getAttributes().windowAnimations = R.style.animation;
                cancel_text = dialog.findViewById(R.id.cancel_text);
                info = dialog.findViewById(R.id.info);
                info.setText(bacterias.getbacteriaByname(ball.getTransitionName()).getInformation());
                cancel_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "Cancel clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();

            }
        });
        orga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.setContentView(R.layout.dialog);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);
                dialog.getWindow().getAttributes().windowAnimations = R.style.animation;
                cancel_text = dialog.findViewById(R.id.cancel_text);
                info = dialog.findViewById(R.id.info);
                info.setText(bacterias.getbacteriaByname(orga.getTransitionName()).getInformation());
                cancel_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "Cancel clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();

            }
        });
        moltawyeh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.setContentView(R.layout.dialog);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);
                dialog.getWindow().getAttributes().windowAnimations = R.style.animation;
                cancel_text = dialog.findViewById(R.id.cancel_text);
                info = dialog.findViewById(R.id.info);
                info.setText(bacterias.getbacteriaByname(moltawyeh.getTransitionName()).getInformation());
                cancel_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "Cancel clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();

            }
        });
        nail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.setContentView(R.layout.dialog);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);
                dialog.getWindow().getAttributes().windowAnimations = R.style.animation;
                cancel_text = dialog.findViewById(R.id.cancel_text);
                info = dialog.findViewById(R.id.info);
                info.setText(bacterias.getbacteriaByname(nail.getTransitionName()).getInformation());
                cancel_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "Cancel clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.show();

            }
        });
    }
}