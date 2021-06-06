package kr.os.com.hufsmera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

        ImageView image1;

        final int PICTURE_REQUEST_CODE = 100;

        @Override
        protected void onCreate (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //UI
            image1 = (ImageView)findViewById(R.id.img1);

            Button btnImage = (Button)findViewById(R.id.btnImage);
            btnImage.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
                    intent.setType("image/*");
                    startActivityForResult(Intent.createChooser(intent, "Select Picture"),  PICTURE_REQUEST_CODE);
                }
            });

            Button btnFilter1 = (Button)findViewById(R.id.btnFilter1);
            btnFilter1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    image1.setColorFilter(Color.parseColor("#55ff0000"));
                }
            });

            Button btnFilter2 = (Button)findViewById(R.id.btnFilter2);
            btnFilter2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    image1.setColorFilter(Color.parseColor("#55ff0000"));
                }
            });

            Button btnFilter3 = (Button)findViewById(R.id.btnFilter3);
            btnFilter3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    image1.setColorFilter(Color.parseColor("#55FFFF99"));
                }
            });

            Button btnFilter4 = (Button)findViewById(R.id.btnFilter4);
            btnFilter4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    image1.setColorFilter(Color.parseColor("#55ff0000"));
                }
            });

            Button btnFilter5 = (Button)findViewById(R.id.btnFilter5);
            btnFilter5.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    image1.setColorFilter(Color.parseColor("#55ff0000"));
                }
            });

            Button btnFilter6 = (Button)findViewById(R.id.btnFilter6);
            btnFilter6.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    image1.setColorFilter(Color.parseColor("#55ff0000"));
                }
            });

            Button btnFilter7 = (Button)findViewById(R.id.btnFilter7);
            btnFilter7.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    image1.setColorFilter(Color.parseColor("#55ff0000"));
                }
            });

            Button btnFilter8 = (Button)findViewById(R.id.btnFilter8);
            btnFilter8.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    image1.setColorFilter(Color.parseColor("#55ff0000"));
                }
            });

            Button btnFilter9 = (Button)findViewById(R.id.btnFilter9);
            btnFilter9.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    image1.setColorFilter(Color.parseColor("#55ff0000"));
                }
            });

            Button btnFilter10 = (Button)findViewById(R.id.btnFilter10);
            btnFilter10.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    image1.setColorFilter(Color.parseColor("#55ff0000"));
                }
            });

        }

    

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICTURE_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {

                //기존 이미지 지우기
                image1.setImageResource(0);
                ClipData clipData = data.getClipData();

                //이미지 URI 를 이용하여 이미지뷰에 순서대로 세팅한다.
                if (clipData != null) {

                    for (int i = 0; i < 1; i++) {
                        if (i < clipData.getItemCount()) {
                            Uri urione = clipData.getItemAt(i).getUri();
                                    image1.setImageURI(urione);
                            }
                        }
                    }
                }
            }
        }



    }


