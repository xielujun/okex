package com.cp.okex.http;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class HttpClient {
	
	private HttpClient(){}
	
	public final static HashMap<String, List<Cookie>> cookieStore = new HashMap<String, List<Cookie>>();
	
	public static final OkHttpClient client = new OkHttpClient.Builder()
			.connectTimeout(5000, TimeUnit.SECONDS)
			.readTimeout(5000, TimeUnit.SECONDS)
			.cookieJar(new CookieJar() {//保存cookie

				public List<Cookie> loadForRequest(HttpUrl paramHttpUrl) {
					List<Cookie> cookies = cookieStore.get(paramHttpUrl.host());
		            return cookies != null ? cookies : new ArrayList<Cookie>();
				}

				public void saveFromResponse(HttpUrl paramHttpUrl, List<Cookie> paramList) {
					cookieStore.put(paramHttpUrl.host(), paramList);
				}
		    })
			.build();
	
	public static String doGet(String url) throws Exception{
		return doGet(url, null);
	}

	public static String doGet(String url, Map<String, String> parameter) throws Exception{
		Builder builder = HttpUrl.parse(url).newBuilder();
		if(parameter!=null && !parameter.isEmpty()){
			Iterator<Entry<String, String>> iterator = parameter.entrySet().iterator();
			while(iterator.hasNext()){
				Entry<String, String> e = iterator.next();
				builder.addQueryParameter(e.getKey(), e.getValue());
			}
		}
		Request request = new Request.Builder().url(builder.build()).build();
		Response response = client.newCall(request).execute();
		if(response!=null && response.isSuccessful()){
			return response.body().string();
		}else{
			throw new Exception(url+"get请求失败!");
		}
	}
	
	
	public static String doPost(String url) throws Exception{
		return doPost(url, new HashMap<String, String>(0));
	}
	
	
	public static String doPost(String url, Map<String, String> parameter) throws Exception{
		FormBody.Builder body = new FormBody.Builder();
		if(parameter!=null && !parameter.isEmpty()){
			Iterator<Entry<String, String>> iterator = parameter.entrySet().iterator();
			while(iterator.hasNext()){
				Entry<String, String> e = iterator.next();
				body.add(e.getKey(), e.getValue());
			}
		}
		Request request = new Request.Builder().url(url).post(body.build()).build();
		Response response = client.newCall(request).execute();
		if(response!=null && response.isSuccessful()){
			return response.body().string();
		}else{
			throw new Exception(url+"请求失败!");
		}
	}
	
	
	public static String doPost(String url, String json) throws Exception{
		MediaType JSON = MediaType.parse("application/json; charset=utf-8");
		RequestBody body = RequestBody.create(JSON, json);
		Request request = new Request.Builder().url(url).post(body).build();
		Response response = client.newCall(request).execute();
		if(response!=null && response.isSuccessful()){
			return response.body().string();
		}else{
			throw new Exception(url+"请求失败!");
		}
	}
	
	
	public static String doPost(String url, File[] files) throws Exception{
		return doPost(url, files, null);
	}
	
	public static String doPost(String url, File[] files, Map<String, String> parameter) throws Exception{
		MultipartBody.Builder builder = new MultipartBody.Builder().setType(MultipartBody.FORM);
		if(files!=null && files.length>0){
			for(File file:files){
				builder.addFormDataPart("file", file.getName(), RequestBody.create(MediaType.parse("multipart/form-data"), file));
			}
		}
		if(parameter!=null && !parameter.isEmpty()){
			Iterator<Entry<String, String>> iterator = parameter.entrySet().iterator();
			while(iterator.hasNext()){
				Entry<String, String> e = iterator.next();
				builder.addFormDataPart(e.getKey(), e.getValue());
			}
		}
		Request request = new Request.Builder().url(url).post(builder.build()).build();
		Response response = client.newCall(request).execute();
		if(response!=null && response.isSuccessful()){
			return response.body().string();
		}else{
			throw new Exception(url+"请求失败!");
		}
	}
	
	public static String doPost(String url, byte[] file, String fileName) throws Exception{
		return doPost(url, file, fileName, null);
	}
	
	public static String doPost(String url, byte[] file, String fileName, Map<String, String> parameter) throws Exception{
		MultipartBody.Builder builder = new MultipartBody.Builder().setType(MultipartBody.FORM);
		if(file!=null && file.length>0){
			builder.addFormDataPart("file", fileName, RequestBody.create(MediaType.parse("multipart/form-data"), file));
		}
		if(parameter!=null && !parameter.isEmpty()){
			Iterator<Entry<String, String>> iterator = parameter.entrySet().iterator();
			while(iterator.hasNext()){
				Entry<String, String> e = iterator.next();
				builder.addFormDataPart(e.getKey(), e.getValue());
			}
		}
		Request request = new Request.Builder().url(url).post(builder.build()).build();
		Response response = client.newCall(request).execute();
		if(response!=null && response.isSuccessful()){
			return response.body().string();
		}else{
			throw new Exception(url+"请求失败!");
		}
	}
	
}
