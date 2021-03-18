package tkhub.project.kesbewa.services.Perfrences

import com.google.api.client.http.HttpRequestInitializer
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.client.json.jackson2.JacksonFactory
import com.google.api.services.youtube.YouTube
import com.google.api.services.youtube.model.SearchResult

import tkhub.project.kesbewa.data.model.YoutubeVideoItem
import java.io.IOException
import java.util.*

class YoutubeConnector {

    var youtube: YouTube
    lateinit var query: YouTube.Search.List
    val PACKAGENAME = "tkhub.project.kesbewa"
    private val MAXRESULTS: Long = 25
    var part: List<String> = ArrayList()


    init {
        youtube = YouTube.Builder(
            NetHttpTransport(),
            JacksonFactory(),
            HttpRequestInitializer { request ->
                request.headers["X-Android-Package"] = PACKAGENAME
                request.headers["X-Android-Cert"] = "cf:55:6f:b8:8d:49:db:be:2e:4c:42:4b:ab:e1:a5:53:f7:9f:ce:77"
              //  request.headers["X-Android-Cert"] = BuildConfig.API_SHA1
            }).setApplicationName("SearchYoutube").build()
        try {
            query = youtube.search().list("id,snippet")
            query.key = "AIzaSyAPVoVkhgDi2joZfw06Ua7RTn1BkMpxUcc"
            query.type = "video"
          //  query.fields = "items(id/kind,id/videoId,snippet/title,snippet/description,snippet/thumbnails/high/url)"

            query.fields =
                "items(id,snippet/title,snippet)"
        } catch (ex: IOException) {
            println("ssssssssssssssssssssssssssssssssssssssss init  :"+ex)

        }
    }


     fun search(keywords: String): List<YoutubeVideoItem> {
        query.q = keywords
        query.maxResults = MAXRESULTS
        try {
            val response = query.execute()
            val results = response.items
            var items: List<YoutubeVideoItem> = ArrayList<YoutubeVideoItem>()

            if (results != null) {
                items = setItemsList(results.iterator())
            }
            println("ssssssssssssssssssssssssssssssssssssssss YoutubeVideoItem "+query)
            return items
        } catch (ex: IOException) {
            println("ssssssssssssssssssssssssssssssssssssssss YoutubeVideoItem "+ex.message)
            println("ssssssssssssssssssssssssssssssssssssssss YoutubeVideoItem "+ex.localizedMessage)
            println("ssssssssssssssssssssssssssssssssssssssss YoutubeVideoItem "+ex.stackTrace)
            return emptyList()
        }
    }


     fun setItemsList(iteratorSearchResults: Iterator<SearchResult>): ArrayList<YoutubeVideoItem> {
        var tempSetItems: ArrayList<YoutubeVideoItem> = ArrayList<YoutubeVideoItem>()

        while (iteratorSearchResults.hasNext()) {
            var singleVideo = iteratorSearchResults.next()

            var rId = singleVideo.id
            if (rId.kind == "youtube#video") {
                var thumbnail = singleVideo.snippet.thumbnails.high

                if( (!singleVideo.id.videoId.isNullOrEmpty()) && (!singleVideo.snippet.title.isNullOrEmpty()) && (!singleVideo.snippet.description.isNullOrEmpty()) && (!thumbnail.url.isNullOrEmpty())            ){
                    var item = YoutubeVideoItem().apply {
                        youtubeid = singleVideo.id.videoId
                        title = singleVideo.snippet.title
                        description = singleVideo.snippet.description
                        thumbnailURL = thumbnail.url
                        channelName = singleVideo.snippet.channelTitle

                    }
                    tempSetItems.add(item)
                }

            }
        }

        return tempSetItems
    }


}