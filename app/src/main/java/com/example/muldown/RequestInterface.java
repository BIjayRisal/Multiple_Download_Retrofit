package com.example.muldown;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Streaming;

public interface RequestInterface {
    @GET("images/futurestudio-logo-transparent.png")
    @Streaming
    Call<ResponseBody> downloadFile();
}
