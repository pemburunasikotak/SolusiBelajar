package bersatu.kita.part11.Model

import com.google.gson.annotations.SerializedName

data class Pelajaran(
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("nama")
    var title: String= "sdaga",
    @SerializedName("Gambar")
    var gambar: String= "https://media.travelingyuk.com/wp-content/uploads/2018/10/YOGYAKARTA-INDONESIA.-SEPTEMBER-2nd-2015-street-view-of-malioboro-at-yogyakarta.jpg",
    @SerializedName("Detail")
    var detail: String= "sdfaf"
)
