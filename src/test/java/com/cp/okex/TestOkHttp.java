package com.cp.okex;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.cp.okex.enums.Url;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TestOkHttp {

	
	static int count = 0;
	
	public static void main(String[] args) throws Exception {
		/*OkHttpClient client = new OkHttpClient();
		HttpUrl url = HttpUrl.parse("http://11134.com").newBuilder().addQueryParameter("test", "test").build();
		Request request = new Request.Builder().url(url).build();
		Response response = client.newCall(request).execute();
		if(response.isSuccessful()){
			System.out.println(response.body().string());
		}else{
			throw new Exception(response.message()+","+response.code());
		}*/
		
		/*OkHttpClient client = new OkHttpClient.Builder().connectTimeout(1, TimeUnit.SECONDS).readTimeout(1, TimeUnit.SECONDS).build();
		HttpUrl url = HttpUrl.parse("http://11134.com").newBuilder().addQueryParameter("test", "test").build();
		Request request = new Request.Builder().url(url).build();
		client.newCall(request).enqueue(new Callback() {
			
			@Override
			public void onResponse(Call arg0, Response arg1) throws IOException {
				count+=1;
				if(arg1.isSuccessful()){
					System.out.println(arg1.code());
					System.out.println(arg1.message());
					System.out.println(arg1.body().toString());
				}
			}
			
			@Override
			public void onFailure(Call arg0, IOException arg1) {
				System.out.println(arg0.request().url().toString());
				arg1.printStackTrace();
			}
		});*/
		
		System.out.println(Url.获取OKEX合约行情.getUrl());
	}

}
