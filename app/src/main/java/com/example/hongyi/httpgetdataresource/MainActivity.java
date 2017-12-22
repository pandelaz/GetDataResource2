package com.example.hongyi.httpgetdataresource;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;

public class MainActivity extends AppCompatActivity {

    //資料來源2 data object
    Data2ResourceObject data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OkHttpClient mOkHttpClient = new OkHttpClient();

                final Request request = new Request.Builder()
                        .url("http://data.taipei/tcmsv/alldesc")
                        .build();

                Call call = mOkHttpClient.newCall(request);

                call.enqueue(new Callback() {
                    @Override
                    public void onFailure(Request request, IOException e) {

                    }

                    @Override
                    public void onResponse(Response response) throws IOException {

                        String DataString = readToString(response.body().byteStream());

                        Gson gson = new Gson();
                        //到這裡已經完成讀取資料來源二並且轉換至object完成
                        data = gson.fromJson(DataString,Data2ResourceObject.class);

                        //第0個停車場資訊讀取範例 詳細看Data2ResourceObject.java內的宣告
                        Log.d("show example Id",data.getData().getPark()[0].getId());
                        Log.d("show example Name",data.getData().getPark()[0].getName());
                        Log.d("show example tw97x",data.getData().getPark()[0].getTw97x());
                        Log.d("show example tw97y",data.getData().getPark()[0].getTw97y());
                    }
                });
            }
        });


    }

    private String readToString(InputStream inputstream) throws IOException {

        StringWriter contents = new StringWriter();
        GZIPInputStream stream = new GZIPInputStream(inputstream);//new FileInputStream(gzipped));

        BufferedReader br = new BufferedReader(new InputStreamReader(stream, Charset.forName("BIG5")));
        String s;
        while((s = br.readLine()) != null) {
            contents.append(s).append('\n');
        }
        stream.close();
        return contents.toString();

    }

}
