package com.example.retrofit01

import android.os.Parcel
import android.os.Parcelable

class DateEntry(
    var id: Int,
    var label: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString().toString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(label)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DateEntry> {
        override fun createFromParcel(parcel: Parcel): DateEntry {
            return DateEntry(parcel)
        }

        override fun newArray(size: Int): Array<DateEntry?> {
            return arrayOfNulls(size)
        }
    }


}
