package com.rendyprayoga.uts_182102030.service;

import com.rendyprayoga.uts_182102030.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUsersList();
}
