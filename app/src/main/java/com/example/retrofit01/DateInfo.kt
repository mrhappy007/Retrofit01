package com.example.retrofit01

import com.example.api.Api
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

data class DateInfo(
    var dateList: MutableList<DateEntry>
) {
    private var isLoading = true

    private var disposable: Disposable? = null

    fun loadDate(onCompleteListener: (() -> Unit)? = null) {
        disposable?.dispose()
        disposable = Api.date.getDefaultDate()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ response ->
                isLoading = false
                val entryList = response.map {
                    DateEntry(it.id, it.label)
                }
                dateList.addAll(entryList)
                onCompleteListener?.invoke()
            }, {
                isLoading = false
                Timber.e(it)
            })
    }
}