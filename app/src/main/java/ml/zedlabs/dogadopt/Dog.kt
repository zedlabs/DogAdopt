package ml.zedlabs.dogadopt

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Dog(
    val index: Int,
    val name: String,
    val breed: String,
    val about: String,
    val location: String,
    val bio: String,
    val imageDrawable: Int,
): Parcelable