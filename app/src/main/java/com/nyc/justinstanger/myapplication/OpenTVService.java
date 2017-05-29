package com.nyc.justinstanger.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface OpenTVService {

    @GET("/v2/shows")
    Call<ShowObject> getShow(@Query("api_key") String apiKey,
                             @Query("sources") String sources,
                             @Query("include_links") String yesLinks,
                             @Query("limit") String limit);

    @GET("/v2/shows")
    Call<ShowObject> getNewEpisodes(@Query("api_key")  String apiKey,
                                    @Query("sources") String sources,
                                    @Query("platform") String android,
                                    @Query("include_links") String yes,
                                    @Query("reverse_ordering") String yesAgain);

    @GET("/v2/shows/{show_id}/episodes")
    Call<EpisodeObject> getEpisodes(@Path("show_id") String id,
                                    @Query("api_key") String apiKey,
                                    @Query("include_links") String yesLinks);


   // http://api-public.guidebox.com/v2/shows/612/episodes?api_key=3efcd3b10e31ccf9b4eed278fa969a2e06f6deb7&include_links=true


    @GET("/v2/channels")
    Call<ChannelObject> getChannel(@Query("api_key") String apiKey,
                                @Query("sources") String sources,
                                @Query("platform") String android,
                                @Query("include_links") String yes);

    @GET("/v2/shows")
    Call<ShowObject>getChannelShows(@Query("api_key") String apiKey,
                                    @Query("channel") String channel);

    @GET("/v2/search")
    Call<ShowObject>getSearchQuery(@Query("api_key") String apiKey,
                                   @Query("type") String showType,
                                   @Query("field") String showField,
                                   @Query("query") String showTitle);

}

