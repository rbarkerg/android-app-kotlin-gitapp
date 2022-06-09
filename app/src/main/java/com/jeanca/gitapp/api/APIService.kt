package com.jeanca.gitapp.api

import com.jeanca.gitapp.models.MRepositoriesList
import com.jeanca.gitapp.models.MUser
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface APIService {

    @GET("/search/repositories")
    fun getRepositories(
        @Query("q") user: String
    ): Observable<MRepositoriesList>

    @GET("/users/{user}")
    fun getUserInfo(
        @Path("user") user: String
    ): Observable<MUser>
}