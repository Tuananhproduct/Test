package com.appify.core.intro

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ItemIntro(val imgIntro: Int = 0, val txtIntro: String = "") : Parcelable

