package org.zakky.qiitaclient.client

import org.zakky.qiitaclient.model.Article
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

interface ArticleClient {
    @GET("/api/v2/items")
    fun search(@Query("query") query: String): Observable<List<Article>>
}
