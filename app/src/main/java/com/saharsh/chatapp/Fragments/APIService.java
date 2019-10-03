package com.saharsh.chatapp.Fragments;

import com.saharsh.chatapp.Notifications.MyResponse;
import com.saharsh.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAxNjVIwY:APA91bGFerYPN56D0NJRXKUK1eOgij3Yb_N0XuBgs4efT2b4U9Qdq2hqbpHloHIjMNhZxhaWaMv8k9n-kAGff5TndZnkk1jj3PYGLbmt6jsuWJoXbM8VFIGRj-EcmnJCQfQpriSrMsTN"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
