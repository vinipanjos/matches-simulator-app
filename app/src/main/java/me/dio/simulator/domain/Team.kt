package me.dio.simulator.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
<<<<<<< HEAD
data class Team (
=======
data class Team(
>>>>>>> b6deb19602ff750c3be5e2baeb901ed5a478c783
    @SerializedName("nome")
    val name: String,
    @SerializedName("forca")
    val stars: Int,
    @SerializedName("imagem")
    val image: String,
    var score: Int?
<<<<<<< HEAD
): Parcelable
=======
) : Parcelable
>>>>>>> b6deb19602ff750c3be5e2baeb901ed5a478c783
