package com.example.joe.weekend5googleplaces.ui.hompage

import android.util.Log
import com.example.joe.weekend5googleplaces.models.PlaceDataResponse
import com.example.joe.weekend5googleplaces.repository.RepositoryImpl
import io.reactivex.SingleObserver
import io.reactivex.disposables.Disposable

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {
    lateinit var repositoryImpl: RepositoryImpl
    override fun onCreate() {
        repositoryImpl = RepositoryImpl()
    }

    override fun getPlace(location: String, type: String) {
        repositoryImpl.getPlaces(location, type)
            .subscribe(object : SingleObserver<PlaceDataResponse> {
                override fun onSuccess(t: PlaceDataResponse) {
                    view.showPlaces(t)
                    Log.d("PresenterPlace", "${t}")

                }

                override fun onSubscribe(d: Disposable) {
                }

                override fun onError(e: Throwable) {
                    e.printStackTrace()
                }

            })
    }

    override fun onDestroy() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onResume() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}