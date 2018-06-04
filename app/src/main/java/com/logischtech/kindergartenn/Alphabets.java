package com.logischtech.kindergartenn;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

public class Alphabets extends AppCompatActivity {
    ImageView btnright , btnleft , btnhome;
    int counter = 0;
    TextView tv1, tv2;
    ImageView img_centre ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);
        btnright = (ImageView)findViewById(R.id.right);
        btnleft = (ImageView)findViewById(R.id.left);
        btnhome = (ImageView)findViewById(R.id.home);
         tv1 = (TextView)findViewById(R.id.tv1);

        tv2 = (TextView)findViewById(R.id.tv2);
        img_centre = (ImageView)findViewById(R.id.img_alphabet);
      //  btnvoice = (ImageView)findViewById( R.id.btnvoice);






        btnright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new HttpAlphabets(Alphabets.this,getApplicationContext()).execute();

            }
        });




    }

    private class HttpAlphabets extends AsyncTask<Object, Object, Alphabet_Api[]> {
        private ProgressDialog progress = new ProgressDialog(Alphabets.this);

        public HttpAlphabets(Alphabets alphabets, Context applicationContext) {
        }

        @Override
        protected Alphabet_Api[] doInBackground(Object... params) {

            try {

                String url = "http://kg-api.azurewebsites.net/api/Alphabets";
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.setErrorHandler(new CustomResponseErrorHandler());
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                Alphabet_Api[] response = restTemplate.getForObject(url, Alphabet_Api[].class);
                return response;
            } catch (Exception ex) {

                this.progress.setMessage("Error");

            }


            return null;


        }

        @Override
        protected void onPreExecute() {
            this.progress.setMessage("Processing");
            progress.setCanceledOnTouchOutside(false);

            this.progress.show();

        }

        @Override
        protected void onPostExecute(Alphabet_Api[] res) {
            super.onPostExecute(res);

            if (progress.isShowing()) {
                progress.dismiss();
                progress = null;

            }
            if (counter < res.length) {

                tv1.setText(res[counter+1].title.toString());
                tv2.setText(res[counter+1].word.toString());

                String uri = "@drawable/" + res[counter+1].image;
                int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                Drawable draw = getResources().getDrawable(imageResource);

                img_centre.setImageDrawable(draw);



                counter++ ;




            }


        }
    }

        private class CustomResponseErrorHandler implements ResponseErrorHandler {
            @Override
            public boolean hasError(ClientHttpResponse response) throws IOException {
                return false;
            }

            @Override
            public void handleError(ClientHttpResponse response) throws IOException {

            }
        }
    }