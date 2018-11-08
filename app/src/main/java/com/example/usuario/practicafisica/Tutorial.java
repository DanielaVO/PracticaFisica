package com.example.usuario.practicafisica;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Tutorial extends AppCompatActivity {

    Button btnMenu;
    VideoView video;
    MediaController media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        iniciar();

        media = new MediaController(this);
        media.setAnchorView(video);
        Uri u = Uri.parse("rtsp://r6---sn-q4flrn7s.googlevideo.com/Cj0LENy73wIaNAmMGKVB_QojPxMYDSANFC3QF95ZMOCoAUIASARg2aSXsOf00p1XigELbWtveXh4LVFVRkEM/6322E09457D9FE820C94B3B8ECB3369B63851E97.AF5EAC85C45A84468E74C4755FEEC8C337266718/yt6/1/video.3gp");
        video.setMediaController(media);
        video.setVideoURI(u);
        video.requestFocus();
        video.start();

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Inicial.class);
                startActivity(i);
            }
        });
    }

    public void iniciar(){
        btnMenu = (Button) findViewById(R.id.btnMenu);
        video = (VideoView) findViewById(R.id.video);


    }
}
